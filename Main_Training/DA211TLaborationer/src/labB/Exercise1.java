package labB;

import java.util.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;

public class Exercise1 implements ActionListener{

	private ArrayList<Text> texts = new ArrayList<Text>();
	private TextViewer viewer = new TextViewer();
	private Timer timer = new Timer(3000, this);
	int index = 0;

	public Exercise1() {
		String s1 = "Att lära utan att tänka är meningslöst, att tänka utan att lära är farligt";
		String s2 = "Den, som tror sig veta allt, vet ingenting ";
		String s3 = "Hellre olärd och klok, än lärd och dum ";
		String s4 = "Sanna ord är inte alltid vackra, vackra ord är inte alltid sanna ";
		texts.add(new Text(s1, Color.blue, Color.yellow, new Font("Serif", Font.BOLD, 14))); texts.add(new Text(s2, Color.white, Color.darkGray, new Font("SansSerif", Font.PLAIN, 24))); texts.add(new Text(s3, Color.yellow, Color.darkGray, new Font("Monospaced", Font.ITALIC, 28))); texts.add(new Text(s4, Color.red, Color.blue, new Font("Dialog", Font.BOLD + Font.ITALIC, 20))); timer.start();
	}

	public void actionPerformed(ActionEvent e) {
		if( index < texts.size() ) {
			viewer.setText(texts.get(index)); // Text i position index visas
			index++; // Position ökas med 1 (ny Text visas vid nästa anrop)
		} else {
			timer.stop(); // Inga fler texter att visa – stoppa timern
			}
		}
		
		public static void main(String[] args) {
			new Exercise1();
		} 

	}
