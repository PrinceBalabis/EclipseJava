package laboration10;

import javax.swing.*;

public class Exercise10h {
	public void a(){
	int intvalue;
    while((intvalue = Integer.parseInt((JOptionPane.showInputDialog(null, "Input a year")))) > 0){

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
}

public static void main( String[] args ){
	Exercise10h main = new Exercise10h();
	main.a();
}
}
