package laboration4;
import javax.swing.*;
public class Program4i {
	
	 int age, year, value;
	 String name;
    		public void thevariableprogram() {
    		name = JOptionPane.showInputDialog( "Ange ditt namn." );
    		age = Integer.parseInt(JOptionPane.showInputDialog( "Ange din ålder." ));
    		year = Integer.parseInt(JOptionPane.showInputDialog( "Ange nuvarande år." ));
    		
    		age = 100 - age;
    		year = year + age;
    		
    		JOptionPane.showMessageDialog( null, name + ", år " + year + " fyller du 100 år" );
    }
    
    
    
    
    public static void main(String[] args) {
        Program4i p4i = new Program4i();
        p4i.thevariableprogram();
    }
}
