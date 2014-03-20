package laboration6;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Program6b {
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

	public static void main(String[] args) {
		Program6b prog = new Program6b();
		prog.date();
	}
}