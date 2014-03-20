package laboration8;

import javax.swing.JOptionPane;

public class Program8h {
	public void a(){
		int tal1, tal2, tal3;
		tal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv tal 1."));
		tal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv tal 2."));
		tal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv tal 3."));
		
		if((tal1 > tal2) && (tal1 > tal3)){
			JOptionPane.showMessageDialog(null, "Tal 1 är störst!");
		}
		
		if((tal2 > tal1) && (tal2 > tal3)){
			JOptionPane.showMessageDialog(null, "Tal 2 är störst!");
		}
		
		if((tal3 > tal2) && (tal3 > tal1)){
			JOptionPane.showMessageDialog(null, "Tal 3 är störst!");
		}
	}
	
	public static void main( String[] args ){
		Program8h main = new Program8h();
		main.a();
	}
}
