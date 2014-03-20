package laboration8;

import javax.swing.*;

public class Program8d {

	public void a(){
		String namn = JOptionPane.showInputDialog(null, "Vad er ditt forstanamn?");
		int nbrOfChars = namn.length();
	
		if(nbrOfChars <= 5){
			JOptionPane.showMessageDialog(null, namn + ", ditt namn är kort och fint!");
		}
	
		if(nbrOfChars > 5){
			JOptionPane.showMessageDialog(null, namn + ", ditt namn är långt och svårstavat!");
		}
	}
	
	public static void main ( String[] args){
		Program8d main = new Program8d();
		main.a();
	}
}
