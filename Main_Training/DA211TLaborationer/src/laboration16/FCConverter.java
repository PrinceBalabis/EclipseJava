package laboration16;

import java.awt.Dimension;
import javax.swing.JFrame;

public class FCConverter {
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new FCConverterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
