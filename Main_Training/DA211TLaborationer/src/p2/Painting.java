package p2;
/****************************************************************************************
 * En klass för att skriva ut titeln på en målning, målaren och året den var målad i
 * ett JOptionPane-meddelande.
 * *************************************************************************************
 */
public class Painting {
	// Deklarerar variabler, för att lagra titeln av tavlan, målarens namn och året målningen blev målad.
	String title, painter; 
	int year;
	
	// Tar emot värden i parametern och lagrar värdena i lokala variabler.
	public Painting(final String title, final String painter, final int year){ 
		this.title = title;
		this.painter = painter;
		this.year = year;
	}
	
	// Ger tillbaka titeln av målningen i form av en String.
	public String getTitle(){
		return title;
	}
	
	// Ger tillbaka målarens namn i form av en String.
	public String getPainter(){
		return painter;
	}
	
	// Ger tillbaka året målningen blev målad i form av en int.
	public int getYear(){
		return year;
	}
	
	// Ger tillbaka en String som innehåller titeln, målaren och året.
	public String toString(){
		return (title + " av " + painter + ", " + year);
	}
}
