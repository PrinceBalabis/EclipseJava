package p2;
/**************************************************************************************
 * En klass för att ge aktuella tiden med hjälp av kalenderklassen.
 **************************************************************************************
 */
// Importerar Calendar-klassen.
import java.util.Calendar;

public class Time {
	// Deklarerar variablerna som behövs för att visa tiden.
	int hour, minute, second;
	
	// Skapar ett objekt av "Calendar.getInstance()" och lagrar aktuella timmen, minuten och sekunden i lokala variabler.
	public Time(){
		Calendar cal = Calendar.getInstance();
		
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	// Ger tillbaka timmen i form av en int.
	public int getHour(){
		return hour;
	}
	
	// Ger tillbaka minuten i form av en int.
	public int getMinute(){
		return minute;
	}
	
	// Ger tillbaka sekunden i form av en int.
	public int getSecond(){
		return second;
	}
	
	// Ger tillbaka tiden i form av en String.
	public String toString(){
		return (hour + ":" + minute + ":" + second);
	}
	
	// Uppdaterar tiden till den aktuella.
	public void update(){
		Calendar cal = Calendar.getInstance();
		
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
}
