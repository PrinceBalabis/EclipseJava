package engine;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;

public class JappletClientConnection {
	private ArrayList<String> bufferLog = new ArrayList<String>();
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
	private int rowNumber = 0;

	public JappletClientConnection() {
		bufferLog.add("Det här är loggen till Malmo2Night serverapplikation!");
		new ListenForConnection().start();
	}

	public void updateLog(String logInput){
		String logTextToPutIn = rowNumber+ " | "+simpleDateFormat.format(Calendar.getInstance().getTime()) + " | " + logInput;
		bufferLog.add(logTextToPutIn);
		rowNumber++;
	}

	private class ListenForConnection extends Thread{
		public void run() {
			Socket socket;
			try {
				ServerSocket serverSocket = new ServerSocket( 4545 );
				while( true ) {
					socket = serverSocket.accept();
					new TalkToClient(socket).start();
				} 			
			} catch( IOException e ) {}
		}
	}

	private class TalkToClient extends Thread {
		private Socket socket;

		public TalkToClient( Socket socket ) {
			this.socket = socket;
		}

		public void run() {
			try {
				String[] answer = new String[bufferLog.size()];
				for (int i = 0; i < bufferLog.size(); i++) {
					answer[i] = bufferLog.get(i);
				}
				ObjectOutputStream oos = new ObjectOutputStream( socket.getOutputStream() );
				oos.writeObject( answer ); 
				oos.flush();

			} catch(Exception e1 ) {} finally {
				//Stäng kopplingen
				try {
					socket.close();
				} catch (IOException e) {}
			}

		}
	}
}
