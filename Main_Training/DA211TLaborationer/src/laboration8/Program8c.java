package laboration8;

import javax.swing.*;

public class Program8c {
	public void a(){
		int age;
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv din ålder"));
				
		if(age <= 17){
			JOptionPane.showMessageDialog(null, "Du är ett barn.");
		}
		
		else if(age > 17){
			JOptionPane.showMessageDialog(null, "Du är vuxen");
			
		}
	}
	
	public static void main( String[] args ){
		Program8c main = new Program8c();
		main.a();
	}
}
