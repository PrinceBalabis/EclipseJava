package laboration10;

import javax.swing.JOptionPane;

public class Exercise10i{
	public static void main(String[]args){
		String input = JOptionPane.showInputDialog("Skriv något");
		
	    for (int count=0; count < input.length(); count++)
	    {
	        System.out.println(input.charAt(count));
	    }
	}
}
