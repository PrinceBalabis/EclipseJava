package laboration16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TransportPanel extends JPanel{
	JLabel lblQuestion, lblAnswer;
	JCheckBox cbCar, cbTrain, cbBus, cbBike, cbWalk;
	
	public TransportPanel(){
		setPreferredSize(new Dimension(400,80));
		setBackground(Color.CYAN);
		
		lblQuestion = new JLabel("Hur tar du dig till MAH?");
		lblQuestion.setPreferredSize(new Dimension(400, 20));
		
		TransportListener listener = new TransportListener();
		
		cbCar = new JCheckBox("Bil");
		cbCar.setPreferredSize(new Dimension(70, 20));
		cbCar.addItemListener(listener);
		
		cbTrain = new JCheckBox("Tåg");
		cbTrain.setPreferredSize(new Dimension(70,20));
		cbTrain.addItemListener(listener);
		
		cbBus = new JCheckBox("Buss");
		cbBus.setPreferredSize(new Dimension(70, 20));
		cbBus.addItemListener(listener);
		
		cbBike = new JCheckBox("Cykel");
		cbBike.setPreferredSize(new Dimension(70,20));
		cbBike.addItemListener(listener);
		
		cbWalk = new JCheckBox("Går");
		cbWalk.setPreferredSize(new Dimension(70,20));
		cbWalk.addItemListener(listener);
		
		lblAnswer = new JLabel();
		lblAnswer.setPreferredSize(new Dimension(400, 20));
		
		add(lblQuestion);
		add(cbCar);
		add(cbTrain);
		add(cbBus);
		add(cbBike);
		add(cbWalk);
		add(lblAnswer);
	}
	private class TransportListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			String res = "Du använder: ";
			if(cbCar.isSelected() == true){
				res += "bil ";
			} if(cbTrain.isSelected() == true){
				res += "tåg ";
			} if(cbBus.isSelected() == true){
				res += "buss ";
			} if(cbBike.isSelected() == true){
				res += "cykel ";
			} if(cbWalk.isSelected() == true){
				res += "går ";
			}
			lblAnswer.setText(res);
		}
	}
	public static void main(String[]args){
		TransportPanel tp = new TransportPanel();
		JOptionPane.showMessageDialog(null, tp);
	}
}
