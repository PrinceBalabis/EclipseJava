package laboration16;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class ColorPanel extends JPanel{
	
	JLabel color;
	JRadioButton red, green, blue, random;
	ButtonGroup group;
	
	public ColorPanel(){
		setPreferredSize(new Dimension(300,150));
		
		color = new JLabel("Välj färg");
		color.setPreferredSize(new Dimension(250, 20));
		
		ColorListener cl = new ColorListener();
		
		red = new JRadioButton("Röd");
		red.setPreferredSize(new Dimension(250, 20));
		red.addActionListener(cl);
		
		green = new JRadioButton("Grön");
		green.setPreferredSize(new Dimension(250, 20));
		green.addActionListener(cl);
		
		blue = new JRadioButton("Blå");
		blue.setPreferredSize(new Dimension(250, 20));
		blue.addActionListener(cl);
		
		random = new JRadioButton("Slump");
		random.setPreferredSize(new Dimension(250,20));
		random.addActionListener(cl);
		
		group = new ButtonGroup();
		group.add(red);
		group.add(green);
		group.add(blue);
		group.add(random);
		
		add(color);
		add(red);
		add(green);
		add(blue);
		add(random);
	}
	private class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(red.isSelected() == true){
				setBackground(Color.RED);
			}else if(green.isSelected() == true){
				setBackground(Color.GREEN);
			}else if(blue.isSelected() == true){
				setBackground(Color.blue);
			}else if(random.isSelected() == true){
				Random rand = new Random();
				Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
				setBackground(color);
			}
		}
	}
	public static void main(String[]args){
		ColorPanel panel = new ColorPanel();
		JOptionPane.showMessageDialog(null, panel);
	}
}