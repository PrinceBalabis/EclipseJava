package p5;

/**
 * Ett testprogram för att verifiera funktionerna på OrdinaryPlayer.
 * @author Prince
 *
 */
public class Uppgift5b {
	public static void main(String[] args) {
		SimpleDice tärning = new SimpleDice( 6 );
		Player spelare1 = new OrdinaryPlayer( "Gustav", tärning );
		Player spelare2 = new OrdinaryPlayer( "Valborg", tärning );
		Game spel = new Game( spelare1, spelare2 );
		spel.play( true );
	}

}
