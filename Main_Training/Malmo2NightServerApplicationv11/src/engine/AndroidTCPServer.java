package engine;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class AndroidTCPServer {
	private DatabaseInitiate di = new DatabaseInitiate(); 
	private Statement statement;
	private ServerSocket serverSocket;
	private static JappletClientConnection jappletLogs;
	/**
	 * Konstruktor som startar loggrutan, TCP-lyssnaren och TCP-svararen.
	 */
	
	public AndroidTCPServer() {
		statement = di.getStatement();
		new PublishErbjudanden(statement).start();
		jappletLogs = new JappletClientConnection();
		new ListenForConnection();
	}

	public static void updateLog(String logInput){
		jappletLogs.updateLog(logInput);
	}
	
	private class ListenForConnection {
		public ListenForConnection(){
			Socket socket;
			try {
				while( true ) {
					serverSocket = new ServerSocket( 25565 );
					socket = serverSocket.accept();
					new TalkToClient(socket).start();
					jappletLogs.updateLog(socket.getInetAddress()+" - Android-klient kopplad");
					serverSocket.close();
				} 			
			} catch( IOException e ) {
				jappletLogs.updateLog("ERROR! Fel med socket-anslutning!");
			}
		}
	}

	private class TalkToClient extends Thread {
		private Socket socket;

		public TalkToClient( Socket socket ) {
			this.socket = socket;
		}

		public void run() {
			try {
				//Ta emot fråga
				ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
				String question = input.readUTF();
				jappletLogs.updateLog(socket.getInetAddress()+" - Tagit emot fråga");
				DatabaseClient dc = new DatabaseClient(statement);
				//Kollar om klienten vill ta emot en bild
				if(question.startsWith("image_")){
					Object[] answer;
					answer = dc.answerQuestionWithImage(question);
					//Svara
					ObjectOutputStream oos = new ObjectOutputStream( socket.getOutputStream() );
					oos.writeObject( answer ); 
					jappletLogs.updateLog(socket.getInetAddress()+" - Skickat bildsvar");
					oos.flush();
				} else {
					String[] answer;
					answer = dc.answerQuestion(question);
					//Svara
					ObjectOutputStream oos = new ObjectOutputStream( socket.getOutputStream() );
					oos.writeObject( answer ); 
					jappletLogs.updateLog(socket.getInetAddress()+" - Skickat textsvar");
					oos.flush();
				}
			} catch(Exception e1 ) {
				jappletLogs.updateLog(socket.getInetAddress()+" - ERROR! Fel med mottagning av fråga/sändning av svar");
			} finally {
				//Stäng kopplingen
				try {
					socket.close();
					jappletLogs.updateLog(socket.getInetAddress()+" - Jobb färdig, stänger ner anslutning");
				} catch (IOException e) {}
			}

		}
	}
}

