package laboration17;

import java.awt.Dimension;
import javax.swing.JFrame;

public class SurveyApp {
	public static void main(String[] args){
		JFrame frame = new JFrame("Personundersökning");
		frame.setPreferredSize(new Dimension(300, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SurveyPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
