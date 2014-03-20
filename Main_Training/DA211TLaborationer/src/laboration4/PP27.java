package laboration4;

import javax.swing.JOptionPane;

public class PP27 {

	int restHours, restMinutes, hours, minutes;
	
	public int getSeconds(){
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Type the seconds"));
	}
	
	public String calcTime(int seconds){
		restHours = 0;
		restMinutes = 0;

		restHours = seconds % 3600;
		hours = (seconds-restHours)/3600;

		restMinutes = restHours % 60;
		minutes = (restHours-restMinutes)/60;
		
		seconds = restMinutes;
		
		return hours +" hours, " + minutes + " minutes, and " + seconds + " seconds.";
	}
	
	public static void main(String[] args) {
		PP27 pp27 = new PP27();
		JOptionPane.showMessageDialog(null, pp27.calcTime(pp27.getSeconds()));
	}

}
