package laboration8;

import javax.swing.*;

public class Program8b {
	public void a() {
		int number;
		number = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv ett heltal"));
		
		if ( number > 100 ) {
			JOptionPane.showMessageDialog(null, "Talet är större än 100");
		}
		
		if ( number < 100) {
			JOptionPane.showMessageDialog(null, "Talet är mindre än 100");
		}
	}
	
	public static void main( String[] args ){
		Program8b main = new Program8b();
		main.a();
	}
}
