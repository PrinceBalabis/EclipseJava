package labD;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class UDPReceiverB implements Runnable {
	private int port;

	public UDPReceiverB( int port ) {
		this.port = port;
	}
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket( port );
			DatagramPacket packet;
			String message;
			byte[] data = new byte[256];
			while( true ) {
				packet = new DatagramPacket(data,data.length);
				socket.receive(packet);
				message=new String(packet.getData(),0,packet.getLength(),"ISO-8859-1");
				System.out.println( message );
			}
		} catch(IOException e) {
			System.out.println( e );
		}
	}
	public static void receive( int port ){
		UDPReceiverB receiver = new UDPReceiverB( port );
		Thread thread = new Thread( receiver );
		thread.start();
	}
	
	public static void main( String[] args ) {
	    UDPReceiverB.receive( 4446 );
	}
}