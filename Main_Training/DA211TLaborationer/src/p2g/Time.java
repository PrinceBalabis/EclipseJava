package p2g;

import java.util.*;

public class Time { 
	private int hour; // Attribut
	private int minute;
	private int second;
	private Calendar cal; 

	public Time() {  // Konstruktor
		cal=Calendar.getInstance();
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}

	public int getHour() { // Instansmetod
		return this.hour;
	}

	public int getMinute() {// Instansmetod
		return this.minute;
	}

	public int getSecond() {// Instansmetod
		return this.second;
	}

	public String toString() { //returerar sträng
		String abc = this.hour + ":" + this.minute + ":" + this.second;
		return abc;
	}

	public void update() {
		cal.setTime(new Date());
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
}