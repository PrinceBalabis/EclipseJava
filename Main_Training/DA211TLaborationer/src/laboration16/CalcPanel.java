package laboration16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener{
	private JLabel lblNbr1, lblNbr2, lblResult;
	private Font fontLabels, fontButtons;
	private JTextField tfNbr1, tfNbr2;
	private JButton btnAdd, btnSub; 
	
	public CalcPanel(){
		setPreferredSize( new Dimension(250,105));

		fontLabels = new Font("SansSerif", Font.PLAIN, 18);
		lblNbr1 = new JLabel("Tal 1");
		lblNbr1.setPreferredSize(new Dimension(100, 20));
		lblNbr1.setFont(fontLabels);
		add(lblNbr1);
		
		tfNbr1 = new JTextField();
		tfNbr1.setPreferredSize(new Dimension(100,20));
		add(tfNbr1);
		
		lblNbr2 = new JLabel("Tal 2");
		lblNbr2.setPreferredSize(new Dimension(100,20));
		lblNbr2.setFont(fontLabels);
		add(lblNbr2);
		
		tfNbr2 = new JTextField();
		tfNbr2.setPreferredSize(new Dimension(100,20));
		add(tfNbr2);
		
		fontButtons = new Font("SansSerif", Font.PLAIN, 24);
		btnAdd = new JButton("+");
		btnAdd.setPreferredSize(new Dimension(100,20));
		btnAdd.setFont(fontButtons);
		add(btnAdd);
		btnAdd.addActionListener(this);
		
		btnSub = new JButton("-");
		btnSub.setPreferredSize(new Dimension(100,20));
		btnSub.setFont(fontButtons);
		add(btnSub);
		btnSub.addActionListener(this);
		
		lblResult = new JLabel("Resultat");
		lblResult.setPreferredSize(new Dimension(200, 20));
		lblResult.setFont(fontLabels);
		add(lblResult);
	}
	
	public void actionPerformed(ActionEvent e) {
		String nbr1Str = tfNbr1.getText();
		String nbr2Str = tfNbr2.getText();
		Double nbr1 = Double.parseDouble(nbr1Str);
		Double nbr2 = Double.parseDouble(nbr2Str);
		if(e.getSource() == btnAdd){
			String res = nbr1Str + " + " + nbr2Str + " = " + (nbr1+nbr2);
			lblResult.setText(res);
		} else {
			String res = nbr1Str + " - " + nbr2Str + " = " + (nbr1-nbr2);
			lblResult.setText(res);
		}
	}
}
