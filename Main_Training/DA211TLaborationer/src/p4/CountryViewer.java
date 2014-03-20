package p4;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CountryViewer extends JPanel{

	private JTextArea taCountry = new JTextArea();
	private JScrollPane scroll = new JScrollPane(taCountry);
	private JTextArea txtStatistics = new JTextArea();


	public CountryViewer(){
		setPreferredSize(new Dimension(400,600));
		taCountry.setFont(new Font("Monospaced", Font.BOLD, 12));
		taCountry.setEditable(false);
		scroll.setPreferredSize(new Dimension(400,490));
		txtStatistics.setPreferredSize(new Dimension(400,100));
		txtStatistics.setBorder(new TitledBorder("Statistik"));
		add(scroll, BorderLayout.CENTER);
		add(txtStatistics, BorderLayout.SOUTH);
	}

	public void showCountries(Country[] countries){
		taCountry.setText("");
		for(Country i: countries){
			taCountry.append(i.toString() + "\n");
		}
	}

	public void showStatistics(String strStatistics){
		txtStatistics.setText(strStatistics);
	}
}
