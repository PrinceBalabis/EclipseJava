package laboration8;

import javax.swing.JOptionPane;

public class Program8f {
	public void a(){
		int tal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv tal 1"));
		int tal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv tal 2"));
	
		if(tal1 > tal2){
			JOptionPane.showMessageDialog(null, tal1 + " är störst!");
		}
		
		if(tal1 < tal2){
			JOptionPane.showMessageDialog(null, tal2 + " är störst!");
		} 
	}
	
	public static void main( String[] args ){
		Program8f main = new Program8f();
		main.a();
	}
}
