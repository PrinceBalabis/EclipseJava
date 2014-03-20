package p2;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class Race {
	// Deklaration av variabler.
	PaintWindow window;
	Car car1;
	Car car2;
	
	// Initierar klassen genom att ta in variabler från parametrar och lagra dem i lokala variabler.
	public Race(PaintWindow window, Car car1, Car car2){
		this.window = window;
		this.car1 = car1;
		this.car2 = car2;
	}
	
	// Metoden Ritar allt PaintWindow-objektet. Bilarna, banan, målet och bakgrunden, samt skapar loopar för att bilarna ska röra sig.
	public void action(){
		Random rand = new Random();
		// Hämtar PaintWindows-objektets storlekar och lagrar i lokala variabler.
		// Sätter även startpositionerna på bilarna och lagrar x-positionen på mållinjen.
		int width = window.getBackgroundWidth(); 
		int height = window.getBackgroundHeight();
		car1.moveTo(width - (width/5), height - (height/4));
		car2.moveTo(width - (width/5), height - (height/2));
		int finishlinex = (width/9);
				
		//Ritar bakgrunden, banorna och mållinjen.
        window.fillRect(0, 0, width, height, Color.GREEN);
        window.line(finishlinex, (car1.getY() + 17), (car1.getX() + 69), (car1.getY() + 17), Color.DARK_GRAY, 40);
        window.line(finishlinex, (car2.getY() + 17), (car2.getX() + 69), (car2.getY() + 17), Color.DARK_GRAY, 40);
		window.line((finishlinex + (finishlinex/6)), (car2.getY()-50), (finishlinex + (finishlinex/6)), (car1.getY()+70), Color.BLACK, 10);

		// Initierar en while loop som fortsätter tills någon av bilarna har nått mållinjen.
		while((car1.getX() > finishlinex) || (car2.getX() > finishlinex)) {
			// Visar bilarna på PaintWindows-objektet med aktuella pixelcoordinater.
			window.showImage(car1.getImage(), car1.getX(), car1.getY());
			window.showImage(car2.getImage(), car2.getX(), car2.getY());
			
			// Slumpmässigt långt flyttar blarna tll vänster för att illustrera ett race.
			car1.moveTo(car1.getX()+rand.nextInt(4) - 4, car1.getY());
			car2.moveTo(car2.getX()+rand.nextInt(4) - 4, car2.getY());

			// Varje förflyttning av bilarna fördröjs med 15ms.
			PaintWindow.pause(15);
		}
		
		// En if-sats som skriver ut ett meddelande vem som vann.
		// Om blå vann skrivs det ut.
		if(car1.getX() <= finishlinex){
			JOptionPane.showMessageDialog(null, "Röd vann!");
		} 
		
		// Om röd vann skrivs det ut.
		else if(car2.getX() <= finishlinex){
			JOptionPane.showMessageDialog(null, "Blå vann!");
		}
	}
}

