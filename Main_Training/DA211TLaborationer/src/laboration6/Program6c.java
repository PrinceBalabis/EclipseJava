package laboration6;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Program6c {
	public void date() {
		int year, dayOfMonth, month;
		String res = "";
		Calendar cal = Calendar.getInstance();

	        dayOfMonth = cal.get( Calendar.DAY_OF_MONTH );
	        year = cal.get( Calendar.YEAR );
	        month = cal.get( Calendar.MONTH ) + 1;
	        
	        res += "Dagens datum: " + dayOfMonth + "/" + month + "-" + year;
	        JOptionPane.showMessageDialog(null,res);
	}

	public void time() {
		int hour, second, minute;
		String res = "";
		Calendar cal = Calendar.getInstance();
		
			second = cal.get( Calendar.SECOND );
			minute = cal.get( Calendar.MINUTE );
			hour = cal.get( Calendar.HOUR_OF_DAY );
			
	        res += "Klockan är " + hour + ":" + minute + ":" + second;
	        JOptionPane.showMessageDialog(null,res);
	}
	
	public void dateAndTime(){
		int year, dayOfMonth, month, hour, second, minute;
		Calendar cal = Calendar.getInstance();

	        dayOfMonth = cal.get( Calendar.DAY_OF_MONTH );
	        year = cal.get( Calendar.YEAR );
	        month = cal.get( Calendar.MONTH ) + 1;
			second = cal.get( Calendar.SECOND );
			minute = cal.get( Calendar.MINUTE );
			hour = cal.get( Calendar.HOUR_OF_DAY );
		
		JOptionPane.showMessageDialog(null,"Dagens datum: " + dayOfMonth + "/" + month + "-" + year + "\n" + "Klockan är " + hour + ":" + minute + ":" + second);
	}
	
	public static void main(String[] args) {
		Program6c prog = new Program6c();
		prog.date();
		prog.time();
		prog.dateAndTime();
	}
}