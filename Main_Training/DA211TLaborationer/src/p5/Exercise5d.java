package p5;
/**
 * 
 * Ett testprogram för verifiera funktionerna på Cheater-klassen.
 * @author TSROAX
 *
 */
public class Exercise5d {

	public static void main(String[] args) {
		Player spelare1 = new OrdinaryPlayer( "Viktor",new SimpleDice( 6 ) );
		Player spelare2 = new Cheater( "Signe", new SimpleDice( 6 ) );
		Game spel = new Game( spelare1, spelare2 );
		TextWindow.println( "\nResultatet av tio spel" );
		for( int i=0; i<10; i++ )
			spel.play( false );
	}

}
