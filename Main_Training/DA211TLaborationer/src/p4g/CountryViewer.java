package p4g;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class CountryViewer extends JPanel {
	//Instansvariabler
	private JLabel lblTitle = new JLabel("Länder och deras befolkning",SwingConstants.CENTER);
	private JTextArea txt = new JTextArea();
	private JScrollPane scrolltxt = new JScrollPane(txt);
	private JTextArea taSummary = new JTextArea();
	
	//Konstruktor
	public CountryViewer(){
		setPreferredSize( new Dimension( 350, 500 ) );
		setLayout(new BorderLayout());
		setBackground(Color.red);
		lblTitle.setSize(350,20);

		txt.setEditable(false);
		taSummary.setText( " " );
		taSummary.setPreferredSize (new Dimension (350,80));
		taSummary.setBackground(Color.red);
		scrolltxt.setSize(350,250);

		add(lblTitle, BorderLayout.NORTH);
		add (scrolltxt, BorderLayout.CENTER);
		add (taSummary,BorderLayout.SOUTH);

	}
	
	//Metod för att skriva ut array med länder.
	public void showCountries (Country[]array){
		String list=" ";
		for(int i = 0; i <array.length; i++ ){
			list=list+array[i]+"\n";
		}
		txt.setText(list);
		
	}
	
	//Visar statistik med hjälp av sträng.
	public void showStatistics (String statistics){
		taSummary.setText(statistics );
	}
	
	
}




