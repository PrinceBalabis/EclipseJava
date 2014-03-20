package laboration8;

import javax.swing.*;

public class Program8i {

	public void a(){
		int intvalue;
		intvalue = Integer.parseInt((JOptionPane.showInputDialog(null, "Input a year")));
	
		if(intvalue % 400 == 0){
			JOptionPane.showMessageDialog(null, "This year is a leapyear!");
		}

		else if(intvalue % 100 == 0 ){
			JOptionPane.showMessageDialog(null, "The year is not a leapyear!");
		}
		
		else if(intvalue % 4 == 0 ){
			JOptionPane.showMessageDialog(null, "The year is a leapyear!");
		}
		
		else if(intvalue < 1582){
			JOptionPane.showMessageDialog(null, "Error!, \nPlease don't input a year before 1582!");
		}
		
		else if(intvalue < 1582){
			JOptionPane.showMessageDialog(null, "Error!, \nPlease don't input a year before 1582!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "This year is not a gapyear!");
		}
	
	}
	
	public static void main( String[] args ){
		Program8i main = new Program8i();
		main.a();
	}
}
