package laboration20;

public class Exercise20a { 
	public void program() {
		// läs in information från befolkning.txt och lagra informationen 
		// i en array av typen Population[].
		Population[] countries = Populations.readPopulations("/Users/Prince/Documents/EclipseWorkspace/DA211TLaborationer/src/laboration20/befolkning.txt" );
		
		// Lösning till deluppgift 0, avmarkera efter testkörning
		//for(int i = 0; i < countries.length; i++ ) { 
		//	System.out.println(countries[ i ].getCountry() + ", " + countries[ i ].getPopulation() );
		//}
		
		// ***Deluppgift 1***
		//for(int i = 0; i < countries.length; i++){
		//	System.out.println(countries[i].getCountry());
		//}

		// ***Deluppgift 2***
		//for(int i = 0; i < countries.length; i++){
		//	if(countries[i].getPopulation() > 100000000){
		//		System.out.println(countries[i].getCountry() + ", " + countries[i].getPopulation());
		//	}
		//}
		
		// ***Deluppgift 3***
		//String country;
		//char charFirst;
		//for(int i = 0; i < countries.length; i++){
		//	country = countries[i].getCountry();
		//	charFirst = country.charAt(0);
		//	
		//	if(charFirst == 'M'){
		//		System.out.println(countries[i].getCountry());
		//	}
		//}
		
		//***Deluppgift 4***
		//for(int i = 0; i < countries.length; i++){
		//	if(countries[i].getPopulation() >= 8000000 && countries[i].getPopulation() <= 10000000){
		//		System.out.println(countries[i].getCountry() + ", " + countries[i].getPopulation());
		//	}
		//}
	
		//***Deluppgift 5***
		//int totalCountries = 0;
		//for(int i = 0; i < countries.length; i++){
		//	if(countries[i].getPopulation() < 1000000){
		//		totalCountries++;
		//	}
		//}
	//	System.out.print(totalCountries + " länder har mindre än 1 miljon invånare");
		
		//***Deluppgift 6***
		//int counter = 0;
		//for(int i = 0; i < countries.length; i++){
		//	String country = countries[i].getCountry();
		//	if(country.charAt(0) == 'K'){
		//		counter++;
		//	}
		//}
		//System.out.print(counter + " länder börjar på bokstaven 'K'");
		
		//***Deluppgift 7***
	//	int counter = 0;
	//	int index = 0;
	//	long inhabitants;
	//	
	//	for(int i = 0; i < countries.length; i++){
	//		if(countries[i].getPopulation() >= 10000000 && countries[i].getPopulation() <= 12000000){
	//		counter++;
	//		}
	//	}

	//	Population[] newArray = new Population[counter];
	//	for( int i = 0; i < countries.length; i++ ) {
	//		inhabitants = countries[ i ].getPopulation();
		//	if( ( inhabitants >= 10000000 ) && ( inhabitants <= 12000000 ) ) {
	//			newArray[ index ] = countries[ i ];
	//			index++; }
	//		}
	//	for(int i = 0; i < newArray.length; i++){
	//		System.out.println(newArray[i] + "  ");
	//	}
		
	//***Deluppgift 8***
	//	int counter = 0;
	//	Population[] newArray = new Population[counter];
	//	
	//	for(int i = 0; i < countries.length; i++){
	//		if(countries[i].getCountry().charAt(i) == 'K'){
	//			newArray[counter] = countries[i];
	//			counter++;
	//		}
	//	}
	//	for(int i = 0; i < newArray.length; i++){
	//		System.out.println(newArray[i] + "  ");
	//		
	//	}
	
	//***Deluppgift 9***
	//for(Population i: countries){
	//	System.out.println(i.getCountry());
	//}
	
	//***Delupggift 10***
		int counter = 0;
	for(Population i: countries){
		if(i.getPopulation() < 1000000){
			counter++;
		}
	}
	System.out.print(counter + " länder har mindre än 1 miljon invånare");
	}
	
	public static void main( String[] args ) { 
		Exercise20a e20a = new Exercise20a(); 
		e20a.program();
	}
}