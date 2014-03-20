package p5;

public class Uppgift5e {

/**
 * Ett program för att verifiera körresultatet på Uppgift 5e.
 * @author Prince
 */
	public static void main(String[] args) {
		TestDice.test( new OrdinaryPlayer( "Rut", new SimpleDice( 6 ) ), 1000000 );
		System.out.println();
		TestDice.test( new Cheater( "Fuffe", new SimpleDice( 6 ) ), 1000000 );
	}

}
