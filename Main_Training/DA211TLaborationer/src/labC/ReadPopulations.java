package labC;

public class ReadPopulations {
	public static void main( String[] args ) {
		System.out.println("Exercise1b");
		Exercise2 e2 = new Exercise2();
		e2.readPopulation( "/Users/Prince/Documents/temp/population.txt" );
		e2.list();
		
		System.out.println();
		System.out.println("Exercise3b");
		Exercise3 e3 = new Exercise3(); 
		e3.readPopulation( "/Users/Prince/Documents/temp/population.dat" );
		e3.list();
	}
}