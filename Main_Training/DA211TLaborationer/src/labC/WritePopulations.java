package labC;

public class WritePopulations {
	public static void main( String[] args ) {
		
		System.out.println("Exercise 2a");
		Population[] pop = {
				new Population( "Kina", 1313973713 ),
				new Population( "Mexico", 107449525 ),
				new Population( "Brasilien", 188078227 ),
				new Population( "USA", 298444215 ),
				new Population( "Bangladesh", 147365352 ),
				new Population( "Nigeria", 131859731 ) };
		Exercise2 e2 = new Exercise2();
		e2.setPopulation( pop );
		e2.list();
		e2.writePopulation( "/Users/Prince/Documents/temp/population.txt" );
		
		System.out.println();
		System.out.println("Exercise3a");
		Exercise3 e3 = new Exercise3(); e3.setPopulation( pop );
		e3.list();
		e3.writePopulation( "/Users/Prince/Documents/temp/population.dat" );
	}
}