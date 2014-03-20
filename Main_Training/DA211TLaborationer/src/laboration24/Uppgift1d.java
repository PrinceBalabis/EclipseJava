package laboration24;

import resurser.InOut;

public class Uppgift1d {
	public static void main( String[] args ) {
		InOut io = new InOut();
		double nbr = io.readDouble( "Mata in ett decimaltal" );
		System.out.println( "Inmatat tal: " + nbr );
	}
}