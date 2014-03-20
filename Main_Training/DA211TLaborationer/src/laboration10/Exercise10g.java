package laboration10;

import javax.swing.*;
import java.util.*;

public class Exercise10g {
	public void exer10g() {
	    int number, randomValue, summan = 0;
	    Random rand = new Random();
	    number = Integer.parseInt( JOptionPane.showInputDialog( "Antal slumptal" ) );
	    System.out.println( "Slumptal: " );
	    for( int i = 1 ; i <= number ; i++ ) {
	        randomValue = rand.nextInt(20) + 5;
	        System.out.print( randomValue + " " );
	        summan = summan+randomValue;
	    }
	    System.out.println();
		System.out.print("Summan: " + summan);
	}
	   

	
	public static void main( String[]args ){
		Exercise10g e10g = new Exercise10g();
		e10g.exer10g();
	}
}
