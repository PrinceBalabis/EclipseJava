package laboration4;

import javax.swing.JOptionPane;

public class PP23 {
    public void valueasks() {
    	float antal1, antal2;
    	antal1 = Float.parseFloat(JOptionPane.showInputDialog( "Ange tal 1" ));
    	antal2 = Float.parseFloat(JOptionPane.showInputDialog( "Ange tal 2" ));

    	
    	float res1 = (antal1 + antal2 );
    	float res2 = (antal1 - antal2 );
    	float res3 = (antal1 * antal2 );
    		JOptionPane.showMessageDialog( null, " The sum is: " + res1 + 
    											"\n The difference is: " + res2 + 
    											"\n The product is: " + res3);
    	
    }


    public static void main( String[] args ) {
        PP23 pp23 = new PP23();
        pp23.valueasks();
    }
}