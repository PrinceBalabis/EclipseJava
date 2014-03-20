package laboration20; 

public class Exercise20c {
	
	public int lessThanOneMillion( Population[] array ) {
		int counter1 = 0;
		for(Population i: array){
			if(i.getPopulation() < 1000000){
				counter1++;
			}
		}
		return counter1;
	}
	
	public int startsWithK( Population[] array ) {
		int counter = 0;
		for(Population i: array){
			if(i.getCountry().charAt(0) == 'K'){
				counter++;
			}
		}
		return counter;
	}
	
	public Population[] getTenToTwelveMillions( Population[] array ) {
		int counter = 0;
		for(Population i : array){
			if(i.getPopulation() >= 10000000 && i.getPopulation() <= 12000000){
				counter++;
			}
		}
		Population[] newArray = new Population[counter];
		int counter2 = 0;
		for(Population o : array){
			if(o.getPopulation() >= 10000000 && o.getPopulation() <= 12000000){
				newArray[counter2] = o;
				counter2++;
			}
		}
		return newArray;
	}
	
	public Population[] getStartsWithK( Population[] array ) {
		int counter = 0;
		for(Population i : array){
			if(i.getCountry().charAt(0) == 'K'){
				counter++;
			}
		}
		
		Population[] newArray = new Population[counter];
		int counter2 = 0;
		for(Population o : array){
			if(o.getCountry().charAt(0) == 'K'){
				newArray[counter2] = o;
				counter2++;
			}
		}
		return newArray;
	}
	
	public void program() {
        Population[] countries = Populations.readPopulations( "src/laboration20/befolkning.txt" );
		// Aktivera testerna en i taget, men först när du kompletterat metoderna med kod.
		
		// test lessThanOneMillion
		int n = lessThanOneMillion( countries );
		System.out.println( n + " länder har mindre än 1 miljon invånare");
		
		// startsWithK
		n = startsWithK( countries );
		System.out.println( n + " länder börjar på bokstaven 'K'");
		
		// test getTenToTwelveMillions
		Population[] res;
		res = getTenToTwelveMillions( countries );
		for( int i = 0; i < res.length; i++ ) {
			System.out.println( res[ i ].toString() );
		}
		
		// test getStartsWithK
		res = getStartsWithK( countries );
			for( int i = 0; i < res.length; i++ ) {
				System.out.println( res[ i ].toString() );
		} 
	}
		
		public static void main( String[] args ) { 
			Exercise20c e20c = new Exercise20c(); 
			e20c.program();
		}
}