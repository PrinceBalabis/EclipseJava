package p4g;

import java.util.Arrays;

import javax.swing.JOptionPane;



public class CountryController {
	// Instansvariabler
	private CountryIO inOut;
	private CountryViewer viewer;
	private Country[] countries;

	// Konstruktor
	public CountryController(CountryViewer viewer, CountryIO inOut) {
		this.viewer = viewer;
		this.inOut = inOut;
		this.countries = inOut.readCountries();

	}

	// Metod för att länder-data läses in
	public void loadCountries() {
		inOut.readCountries();
		Country[] countries = inOut.readCountries();
		viewer.showCountries(countries);
	}

	// Länder-data sparas på hårddisken
	public void saveCountries() {
		inOut.saveCountries(countries);
	}

	// Metod för att retunera min-värde
	public long setMinimum(Country[] array) {
		long min = array[0].getPopulation();
		for (int i = 1; i < array.length; i++) {
			if (array[i].getPopulation() < min) {
				min = array[i].getPopulation();
			}
		}
		return min;
	}

	// Metod för att retunera max-värde
	public long setMaximum(Country[] array) {
		long max = 0;
		for (int i = 0; i < array.length; i++) {
			while (array[i].getPopulation() > max) {
				max = array[i].getPopulation();
			}
		}
		return max;
	}

	// Metod för att visa all länder
	public void showAllCountries() {
		long caunter1 = 0;
		for (int i = 0; i < countries.length; i++) {
			countries[i].toString();
			caunter1 = caunter1 + countries[i].getPopulation();
		}
		viewer.showCountries(countries);
		String statistics = "Statistik" + "\n" + "Antal länder:"
				+ countries.length + "\n" + "Total befolkning:" + caunter1
				+ "\n" + "Minsta befolkning:" + setMinimum(countries)
				+ ",Största befolkning:" + setMaximum(countries);
		viewer.showStatistics(statistics);
	}

	// Metod för att visa utvalda länder med min/max värde
	public void showSelection(long min, long max) {
		int counter = 0;
		int index = 0;
		long caunter1 = 0;
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].getPopulation() > min
					&& countries[i].getPopulation() < max) {
				counter++;
				caunter1 = caunter1 + countries[i].getPopulation();
			}
		}
		Country[] newArray = new Country[counter];
		for (int i = 0; i < countries.length; i++) {
			if ((countries[i].getPopulation() >= min)
					&& (countries[i].getPopulation() < max)) {
				newArray[index] = countries[i];
				index++;
			}
		}
		viewer.showCountries(newArray);
		String statistics = "Antal länder:" + newArray.length + "\n"
				+ "Total befolkning:" + caunter1 + "\n" + "Minsta befolkning:"
				+ setMinimum(newArray) + ",Största befolkning:"
				+ setMaximum(newArray);
		viewer.showStatistics(statistics);
	}

	// Metod för att hantera felinmatningar
	public void error(int t, int d) {
		if (t == 1 && d == 1) {
			JOptionPane.showMessageDialog(null,
					" Inmatat Land Återfinns Ej I Listan");
		}
	}

	// Metod för att ändra population på ett land.
	public void changePopulation(String country, long population) {
		long caunter1 = 0;
		int t = 0;
		int x = 1;
		for (int i = 0; i < countries.length; i++) {
			if (country.equals(countries[i].getName()) && x == 1) {
				countries[i] = new Country(country, population);
				x = 0;
			} else {
				t = 1;
			}
		}
		error(t, x);
		for (int i = 0; i < countries.length; i++) {
			caunter1 = caunter1 + countries[i].getPopulation();
		}
		showAllCountries();
		String statistics = "Statistik" + "\n" + "Antal länder:"
				+ countries.length + "\n" + "Total befolkning:" + caunter1
				+ "\n" + "Minsta befolkning:" + setMinimum(countries)
				+ ",Största befolkning:" + setMaximum(countries);
		;
		viewer.showStatistics(statistics);
	}
}
