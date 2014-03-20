package laboration11;

import javax.swing.JOptionPane;

public class Date {
	int year, month, day;
	
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void showDate(){
		JOptionPane.showMessageDialog(null, this.day +"/" + this.month + "-" + this.year);
	}
}
