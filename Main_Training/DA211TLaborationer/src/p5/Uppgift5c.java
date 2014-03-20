package p5;

/**
 * Ett testprogram för att verifiera funktionerna på TestDice-klassen.
 * @author Prince
 *
 */
public class Uppgift5c {
	public static void main(String[] args) {
		TestDice.test( new SimpleDice( 6 ), 1000000 );
		TextWindow.println();
		TestDice.test( new SimpleDice( 4 ), 1000000 );
	}

}
