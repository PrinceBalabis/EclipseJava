package laboration16;

import javax.swing.*;

public class StartAll{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new AllPanels());
		frame.pack();
		frame.setVisible(true);
	}
}
