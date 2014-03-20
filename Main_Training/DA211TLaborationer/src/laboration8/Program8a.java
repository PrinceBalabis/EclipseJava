package laboration8;

import javax.swing.*;

public class Program8a {
	public void a(){
		String message = "Talet är större än 100";
		int number = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv ett heltal" ));
		if( number > 100 ) {
			JOptionPane.showMessageDialog( null, message);
		}
	}
	
	public static void main(String[] args) {
			Program8a pr = new Program8a();
			pr.a();
	}
}