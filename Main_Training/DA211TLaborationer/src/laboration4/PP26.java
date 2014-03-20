package laboration4;

import javax.swing.JOptionPane;

public class PP26 {
	
	public int getTime(String message){
		return Integer.parseInt(JOptionPane.showInputDialog(null, message));
	}
	
	public int calculateSeconds(int hours, int minutes, int seconds){
		hours *= 3600;
		minutes *= 60;
		return seconds+hours+minutes;
		
	}
	
	public static void main(String[] args) {
		int hours, minutes, seconds, resSeconds;
		PP26 pp26 = new PP26();
		
		hours = pp26.getTime("Type the hours");
		minutes = pp26.getTime("Type the minutes");
		seconds = pp26.getTime("Type the seconds");

		resSeconds = pp26.calculateSeconds(hours, minutes, seconds);
		JOptionPane.showMessageDialog(null, "Det är " + resSeconds + " sekunder.");
	}

}
