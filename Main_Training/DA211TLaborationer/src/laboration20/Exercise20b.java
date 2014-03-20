package laboration20;


public class Exercise20b {
	
	public void printCountries( Population[] array ) {
		for(int i = 0; i < array.length; i++){
		System.out.println(array[i] + "  ");
		}
	}
	
	public void moreThanHundredMillions( Population[] array ) {
		for(int i = 0; i < array.length; i++){
			if(array[i].getPopulation() > 100000000){
				System.out.println(array[i] + "  ");
			}
		}
	}
	
	public void startsWithM( Population[] array ) {
		for(Population i: array){
			String string = i.getCountry();
			if(string.charAt(0) == 'M'){
				System.out.println(i + "  ");
			}
		}
	}
	
	public void eightToTenMillions( Population[] array ) {
		for(Population i: array){
			if(i.getPopulation() >= 8000000 && i.getPopulation() <= 10000000){
				System.out.println(i + "  ");
			}
		}
	}
	
	public void program() {
        Population[] countries = Populations.readPopulations( "/Users/Prince/Documents/EclipseWorkspace/DA211TLaborationer/src/laboration20/befolkning.txt" );
		// Aktivera metoderna en i taget, men först när du kompletterat // med kod.
//		printCountries( countries ); 
//		moreThanHundredMillions(countries); 
//		startsWithM(countries); 
		eightToTenMillions(countries);
	}
	
		public static void main( String[] args ) { 
		Exercise20b e20b = new Exercise20b(); 
		e20b.program();
		} 
}