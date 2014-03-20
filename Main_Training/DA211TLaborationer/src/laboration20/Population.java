package laboration20;

/**
 * Klassen lagrar ett lands befolkning
 * @author Rolf
 */
public class Population implements Comparable{
    private String country;
    private long population;
    
    public Population( String country, long population ) {
        this.country = country;
        this.population = population;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public long getPopulation() {
        return this.population;
    }
    
    public String toString() {
        return String.format( "%-30s%15d", this.country, this.population );
    }

    public int compareTo( Object obj ) {
    	int value = 0;
    	Population country = ( Population )obj;
    	long inhabitants = country.getPopulation();
    	if(this.population < inhabitants){
    		value = -1;
    	} else if(this.population > inhabitants){
    		value = 1;
    	}
    	// Nu ska this.population och inhabitants jämföras
    	// Om this.population är minst ska värdet -1 returneras
    	// Om inhabitants är minst ska värdet 1 returneras
    	// Om this.population och inhabitants är lika stora så ska 0 returneras
		return value;
    	}
}