package laboration16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FCConverterPanel extends JPanel implements ActionListener{
	
	JLabel degrees, results;
	JTextField input;
	JButton f, c, exit;
	
	public FCConverterPanel(){
		setPreferredSize(new Dimension(220, 150));
		
		degrees = new JLabel("Grader: ");
		degrees.setPreferredSize(new Dimension(100, 20));
		
		input = new JTextField();
		input.setPreferredSize(new Dimension(100, 20));
		
		results = new JLabel();
		results.setText("Resultat: ");
		results.setPreferredSize(new Dimension(200,20));
		
		f = new JButton();
		f.setText("Till Fahrenheit");
		f.setPreferredSize(new Dimension(100,20));
		f.addActionListener(this);
		
		c = new JButton();
		c.setText("Till Celcius");
		c.setPreferredSize(new Dimension(100, 20));
		c.addActionListener(this);
		
		exit = new JButton();
		exit.setText("Avsluta");
		exit.setPreferredSize(new Dimension(200, 20));
		exit.addActionListener(this);
		
		add(degrees);
		add(input);
		add(results);
		add(f);
		add(c);
		add(exit);
	}
	public void actionPerformed(ActionEvent e){
		String inputStr = input.getText();
		Double inputDbl = Double.parseDouble(inputStr);
		if(e.getSource() == f){
			inputDbl = 32+1.8*inputDbl;
			String resultsStr = "Fahrenheit: " + String.format("%1.1f", inputDbl) + " F";
			results.setText(resultsStr);
		} else if(e.getSource() == c){
			inputDbl = ((inputDbl-32)/1.8);
			String resultsStr = "Celcius: " + String.format("%1.1f", inputDbl) + " C";
			results.setText(resultsStr);
		} else if(e.getSource() == exit){
			System.exit(0);
		}
	}
	public static void main(String[]args){
		FCConverterPanel panel = new FCConverterPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JOptionPane.showMessageDialog(null, panel);
	}

}