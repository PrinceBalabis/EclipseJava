package p2g;

/* class Painting skrivs som hjälper oss att 
 * lösa uppgiften i Exercise2a
 * @author Aleksandar Dojcinovic den 22/10-2012*/
 

public class Painting {
	private int year; // attributer
	private String painter, title; 
	
public Painting (String title, String painter, int year){
	
this.title=title;
this.painter=painter;
this.year=year;
}
public String getTitle() { // instansmetod
	return title;
}
public  String getPainter() {
	return painter;
}
public int getYear() {
	return year;
}
public String toString() {
	String p1p2 = this.title + "av" + this.painter + ", " + this.year; // sträng skapas och sedan retureras och visar 2 olika meddelanden i olika fönstren
	return p1p2;
	}
}
