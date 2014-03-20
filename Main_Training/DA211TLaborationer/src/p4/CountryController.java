package p4;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CountryController{
	private CountryViewer viewer;
	private CountryIO inOUT;
	private Country[] countries;
	private int counter;
	private long populationCounter;
	private long biggestPopulation;
	private long smallestPopulation;
	private JFileChooser chooser = new JFileChooser();
	private FileNameExtensionFilter filefilter = new FileNameExtensionFilter(
			"Text", "txt");
	
	public CountryController(CountryViewer viewer, CountryIO inOUT){
		this.viewer = viewer;
		this.inOUT = inOUT;

		// Läser in Country-arrayen och lagrar i lokal Country-array.
		countries = inOUT.readCountries();
		
		// Bestämmer att man bara kan importera textfiler.
		chooser.setFileFilter(filefilter);
	}

	/**
	 * Läser in Country-arrayerna från filen på hårddisken och 
	 * visar på CountryViewer. Visar även statistik
	 */
	public void loadCountries(){
		//	Visar en dialog för att importera textfilen.
		chooser.showOpenDialog(null);
		// Tar sökvägen till den importade textfilen och skickar den till CountryIO.
			inOUT.setFilename(chooser.getSelectedFile().toString());
		// Läser in Country-arrayerna den importerade textfilen och visar på CountryViewer.
		viewer.showCountries(inOUT.readCountries());
		// Visar statistiken
		showStatistics(countries);
	}

	/**
	 * Sparar länderna i en fil på hårddisken.
	 */
	public void saveCountries(){
		// Tar Country-arrayen 'countries' och sparar arrayen i en fil på hårddisken med hjälp av CountryIO.
		inOUT.saveCountries(countries);
	}

	/**
	 * Återställer listan(Tar bort föregående sökkriterier.).
	 */
	public void showAllCountries(){
		// Läser in Country-arrayerna från filen på hårddisken och visar på CountryViewer.
		viewer.showCountries(countries);
		// Visar statistiken
		showStatistics(countries);
	}

	/**
	 * Visar länder som uppfyller sökkriterna på minsta och högsta befolkning.
	 */
	public void showSelection(long min, long max){
		// Nollställer räknare inför kommande loop.
		counter = 0;
		
		// Räknar ut hur lång den nya arrayen ska vara.
		for(int i = 0; i < countries.length; i++){
			if(countries[i].getPopulation() >= min && countries[i].getPopulation() <= max){
				counter++;
			}
		}
		
		// Skapar en ny Country-array för att lagra de önskade länderna. 
		// Längden av den nya arrayen räknades ut i den förra loopen.
		Country[] newCountriesArray = new Country[counter];
		// Nollställer räknare inför kommande loop.
		counter = 0;
		
		// Söker igenom populationen i countries-arrayen för att få fram länder med önskade population.
		// Hittar den ett land med önskad population lagrar den värdena i den nya arrayen.
		for(int i = 0; i < countries.length; i++){
			if(countries[i].getPopulation() >= min && countries[i].getPopulation() <= max){
				newCountriesArray[counter] = countries[i];
				counter++;
			}
		}
		// Visar den nya arrayen med önskade sökresultat på CountryViewer.
		viewer.showCountries(newCountriesArray);
		// Visar den nya statistiken med önskade sökresultat på CountryViewer
		showStatistics(newCountriesArray);
	}

	/**
	 * Ändrar befolkningen hos ett land.
	 */
	public void changePopulation(String country, long population){
		// Nollställer en switch behövd för kommande loop.
		counter = 0;

		// En loop som söker igen alla länder i countries-arrayen efter önskade land.
		// Hittar den landet tömmer den värdena i just den indexen och ersätter den med den nya befolkningen.
		// Dessutom sätter den 'counter = 1' så att meddelanderuta inte visas.
		// Efter processen visas den ändrade arrayen i CountryViewer och slutar loopen.
		for( int i = 0; i < countries.length; i++){
			if(countries[i].getName().equals(country)){
				countries[i] = null;
				countries[i] = new Country(country, population);
				counter = 1;
				showAllCountries();
				showStatistics(countries);
				break;
			} 
		}
		// Om landet ej har hittats är "'counter = 0' == true" och en meddelanderuta säger att 
		// landet ej finns med i listan.
		if(counter == 0){
			JOptionPane.showMessageDialog(null, country + " finns ej i listan med länder!");
		}
	}

	/**
	 * Visar statistiken.
	 */
	private void showStatistics(Country[] countries){
		// Återställer räknarna inför kommande loopar.
		counter = 0;
		populationCounter = 0;
		biggestPopulation = 0;
		smallestPopulation = 0;

		// Räknar hur många länder det finns i arrayen och det sammanlagda befolkningen,
		// dessutom söker efter den största och minsta befolkningen.
		for(int i = 0; i < countries.length; i++){
			counter++;
			populationCounter += countries[i].getPopulation();
			if(countries[i].getPopulation() > biggestPopulation){
				biggestPopulation = countries[i].getPopulation();
			}if(i == 0){
				smallestPopulation = countries[0].getPopulation();
			}if(countries[i].getPopulation() < smallestPopulation){
				smallestPopulation = countries[i].getPopulation();
			}
		}

		// Skriver ut antalet länder, sammanlagda befolkning och mindsta och högsta befolkningen i arrayen.
		viewer.showStatistics("Antal länder: " + counter
				+ "\nTotal befolkning: " + populationCounter
				+ "\nMinsta befolkning: " + smallestPopulation + ", Största befolkning: " + biggestPopulation);
	}
}
