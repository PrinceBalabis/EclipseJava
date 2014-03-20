package p2g;

/**
 * @author Aleksandar Dojcinovic
 * 
 */

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;



public class Race {
	private PaintWindow window;// Här är tre instansvariablerna som är privata.
	private Car car1;
	private Car car2;

	public Race(PaintWindow window, Car car1, Car car2){
		this.window =  window;// där skapas konstrukter.
		this.car1  = car1;
		this.car2  = car2;
	}
// initierar bakgrunden
	private void initBackground(){
		window.fillRect(0,0, window.getBackgroundWidth(), 400, Color.green);
		window.fillRect(0,150,600,50, Color.gray);
		window.fillRect(0,200,600,50, Color.white);
		window.fillRect(0,220,600,10, Color.black);
		window.fillRect(0,250,600,50 ,Color.gray);
		window.line(30,0, 30, 500, Color.BLACK, 3);
	    
		car1.moveTo(500,150);
		car2.moveTo(500,250);
	}
	public void action(){
		//  Där skapas paintwindow

		initBackground();
		Random rnd = new Random ();
		
		window.showImage(car1.getImage(), car1.getX(), car1.getY());
		window.showImage(car2.getImage(), car2.getX(), car2.getY());                               
		while (car1.getX() >=30 && car2.getX()>=30){//om vilkor är sant upprepas den, annars stopas.
			int rand1 = rnd.nextInt (6);
		    int rand2 = rnd.nextInt (6);
		    car1.moveTo(car1.getX()-rand1,150);// Move metoden gör att bilarna körs .
		    car2.moveTo(car2.getX()-rand2, 250);

		    window.showImage(car1.getImage(), car1.getX(), car1.getY());// hämtar bilarna från angivna address
			window.showImage(car2.getImage(), car2.getX(), car2.getY());  


	PaintWindow.pause(10);
	
	 
		}
	}
}
		


