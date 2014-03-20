

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//No need to extend JApplet, since we don't add any components;
//we just paint.
public class JappletServerLogViewer extends JApplet {
	private ArrayList<String> buffer = new ArrayList<String>();
	private JTextArea logText;
	private boolean loggedIn;
	private JButton refreshButton;

	//Kör inloggningen
	public void init() {
		JTextField username = new JTextField(10);
		JPasswordField password = new JPasswordField(10);
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Användarnamn"));
		myPanel.add(username);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("Lösenord")); 
		myPanel.add(password);
		
		int input = JOptionPane.showConfirmDialog(null, myPanel, "Malmo2Night Serverlogg Inloggningsskärm", JOptionPane.OK_CANCEL_OPTION);
		
		logText = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(logText);
		logText.setEditable(false);
		JPanel panel = new JPanel(new BorderLayout());
		if (input == JOptionPane.OK_OPTION && username.getText().equals("malmo2night") && password.getText().equals("yolo") ) {
//			if(loggedIn==false){
//				this.removeAll();
//			}
			loggedIn = true;
			refreshButton = new JButton();
			panel.add(refreshButton, BorderLayout.SOUTH);
			setSize(600, 800);
			refreshButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						new ServerConnection();
				}
			});
			refreshButton.setText("Uppdatera loggrutan");
		} else {
			loggedIn = false;
			logText.setText("Du måste logga in för att se detta");
			setSize(300, 100);
		}
		panel.add(scrollPane); 
		add(panel);
	}

	public void start() {
		if(loggedIn){
			new ServerConnection();
		}
	}

	private void addItem(String newWord) {
		buffer.add(newWord);
	}

	private void clearLog(){
		logText.setText("");
		buffer.clear();
	}

	private void refreshLogFrame() {
		for( int i=0; i<buffer.size(); i++ ) {  
			logText.append(buffer.get(i)+"\n");
		}  
		//		pack();
	}

	//	private void pack() {
	//		Container cp = getContentPane();
	//		Dimension d = cp.getLayout().preferredLayoutSize(cp);
	//		setSize((int)d.getWidth(),(int)d.getHeight());
	//	}

	private class ServerConnection {
		private String[] answer;
		private Socket socket;
		private boolean isConnected = false;
		public ServerConnection(){
			addItem("Försöker ansluta till serverapplikationen...");
			//Kopplar sig till serverapplikationen
			try {
				socket = new Socket(InetAddress.getByName("195.178.234.232"), 4545 );   /// IP OCH PORT TILL SERVER �NDRAS H�R
				addItem("Kopplad till serverapplikationen");
				refreshButton.setText("Uppdatera loggrutan");
				isConnected = true;
			} catch(Exception e) {
				addItem("ERROR! Servern är för tillfället offline!");
				refreshButton.setText("Försök uppkoppling till servern igen");
				refreshLogFrame();
			}
			//Hämta svar
			if(isConnected){
				try {
					ObjectInputStream input = new ObjectInputStream( socket.getInputStream() );
					try {
						answer = (String[]) input.readObject();
						clearLog();
						for (int i = 0; i < answer.length; i++) {
							addItem(answer[i]);
						}
						addItem("Logg utskriven");
						refreshLogFrame();
					} catch (ClassNotFoundException e) {}
				} catch(IOException e) {}
				// St�nger kopplingen
				try{
					socket.close();
					addItem("Server frånkopplad");
				} catch(IOException e) {}
			}
		}
	}
}


