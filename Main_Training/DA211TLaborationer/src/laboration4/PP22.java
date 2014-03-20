package laboration4;

import javax.swing.JOptionPane;

public class PP22 {
    public void valueasks() {
    	double antal1, antal2, antal3;
    	antal1 = Double.parseDouble(JOptionPane.showInputDialog( "Ange tal 1" ));
    	antal2 = Double.parseDouble(JOptionPane.showInputDialog( "Ange tal 2" ));
    	antal3 = Double.parseDouble(JOptionPane.showInputDialog( "Ange tal 3" ));

    	double res = ((antal1 + antal2 + antal3)/3);
    		JOptionPane.showMessageDialog( null, res );
    }


    public static void main( String[] args ) {
        PP22 pp22 = new PP22();
        pp22.valueasks();
    }
}