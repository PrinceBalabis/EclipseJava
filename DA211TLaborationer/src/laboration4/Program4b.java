package laboration4;

import javax.swing.JOptionPane;

public class Program4b {
    public void info() {
        // Lägg till instruktioner här
    	String name = JOptionPane.showInputDialog("Ange ditt namn");
    	int number = Integer.parseInt(JOptionPane.showInputDialog("Ange antal Java-program som du har skrivit"));
    	System.out.println("Hej, mitt namn är "+name+"\nJag har skrivit "+number+" program i Java.\nDet är KUL med Java!!!");
    }

    public static void main( String[] args ) {
        Program4b p4 = new Program4b();
        p4.info();
    }
}