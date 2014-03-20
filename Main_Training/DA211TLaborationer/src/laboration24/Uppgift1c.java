package laboration24;

import resurser.InOut;

public class Uppgift1c {
	public static void main( String[] args ) {
		InOut io = new InOut();
		int nbr = io.readInt( "Mata in ett tal utan decimaler" );
		System.out.println( "Inmatat tal: " + nbr );
	}
}