package labC;

import java.io.*; // Filhanteringen
import java.util.*; // ArrayList

public class Exercise2 {
	private ArrayList<Population> population = new ArrayList<Population>();
	
	public void setPopulation( Population[] pop ) { 
		population.clear(); // så att population är tom från början
		for( int i = 0; i < pop.length; i++ ) {
			population.add( pop[ i ] );
		}
	}

	public void list() {
		for( int i = 0; i < population.size(); i++ ) {
			System.out.println(population.get( i ).toString() ); }
	}

	public void writePopulation( String filename ) { 
		try{
			FileWriter fw = new FileWriter( filename );
			BufferedWriter bw = new BufferedWriter( fw );
			
			// Här ska vi skriva kod som överför data till filen
			Population pop;
			String str;
			
			for( int i = 0; i < population.size(); i++ ) {
				pop = population.get( i ); // hämta Population-objekt ur ArrayListen
				str = pop.getName() + ", " + pop.getInhabitants(); // t.ex. "Kina,1313973713"
				bw.write( str ); // Skriva strängen till textfilen
				bw.newLine(); // Skriva ny-rad-tecken till textfilen
			}
			
			bw.close();
		} catch( IOException e ){
			System.out.println( e );
		}
	
	}
	
	public void readPopulation( String filename ) {
		try {
			FileReader fr = new FileReader( filename );
			BufferedReader br = new BufferedReader( fr );
			
			String inStr;
			long inhabitants;
	        String[] parts;
	        
			// Här ska ArrayListen tömmas, textrader läsas in, göras om till Population-objekt och
			// lagras i ArrayListen
	        
	        population.clear();
			inStr = br.readLine();
			while( inStr != null ){
				parts = inStr.split(", ");
				inhabitants = Long.parseLong( parts[ 1 ] ); // konvertera parts[1] till long
				population.add( new Population( parts[ 0 ], inhabitants ) ); // skapa och lagra Population-objekt
				inStr = br.readLine();
			}
			br.close();
		} catch( IOException e ){
			System.out.println( e );
		}
	} 
}