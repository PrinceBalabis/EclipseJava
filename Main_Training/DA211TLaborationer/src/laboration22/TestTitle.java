package laboration22;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestTitle extends JPanel{
	Title title1 = new Title("Rött och svart", Font.BOLD, 25, Color.red, Color.black);
	Title title2 = new Title("Blå text - gul bakgrund", Font.PLAIN, 20, Color.BLACK, Color.YELLOW);
	Title title3 = new Title("Denna rubrik är i SOUTH", Font.ITALIC, 15, Color.white, Color.BLACK);
	
	public TestTitle(){
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(400,150));
		add(title1, BorderLayout.NORTH);
		add(title2, BorderLayout.CENTER);
		add(title3, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Hi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TestTitle testtitle = new TestTitle();
		frame.add(testtitle);
		frame.pack();
		frame.setVisible(true);
	}
}
