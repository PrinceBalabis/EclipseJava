package laboration4;

import javax.swing.JOptionPane;

public class Program4b {
    public void nameask() {
    	String name, antal;
    	name = JOptionPane.showInputDialog( "Ange ditt namn" );
    	antal = JOptionPane.showInputDialog( "Ange antal Java-program som du har skrivit" );
    	System.out.println("Hej, mitt namn är " + name);
    	System.out.println("Jag har skrivit " + antal + " program i Java.");
    	System.out.println("Det är KUL med Java!!!");
    }


    public static void main( String[] args ) {
        Program4b p4 = new Program4b();
        p4.nameask();
    }
}