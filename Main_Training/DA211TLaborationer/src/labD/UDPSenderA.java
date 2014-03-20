package labD;

import java.net.*;
import java.io.*;

import javax.swing.JOptionPane;

public class UDPSenderA {
	public static void send( String ip, int port, String[] messages ){
		try{
			InetAddress reciever = InetAddress.getByName( ip );
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet;
			byte[] data;

			for(int i=0; i<messages.length; i++){
				data = messages[i].getBytes("ISO-8859-1");
				packet = new DatagramPacket(data, data.length, reciever, port);
				socket.send( packet );
				Thread.sleep( 3000 );
			}
		} catch( IOException e1 ){
			System.out.println( e1 );
		} catch( InterruptedException e2 ){
			System.out.println( e2 );
		}
	}

	public static void main( String[] args ) {
		while(true){
		String med = JOptionPane.showInputDialog("Skriv");
		String[] meddelanden = { med };
		try {
			Thread.sleep( 500 ); // vänta 5 sek med att starta sändningen
		} catch ( InterruptedException e ) {}
		UDPSenderA.send( "10.1.0.105", 4446, meddelanden ); }
	}
}