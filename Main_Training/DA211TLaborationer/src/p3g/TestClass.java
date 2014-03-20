package p3g;

import javax.swing.JFrame;

public class TestClass {
	public void start() {
		JFrame frame = new JFrame("QuizInput");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new QuizInput());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		TestClass app = new TestClass();
		app.start();
	}
}