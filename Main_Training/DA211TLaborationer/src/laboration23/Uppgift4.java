package laboration23;
import java.awt.*;

import javax.swing.Icon;
import java.awt.geom.*;  // Behövs vid anrop till draw/fill
import javax.swing.*;  // Behövs om du ska använda bilder
import java.awt.image.*;  // Behövs om du ska använda bilder
import java.util.Random;

public class Uppgift4 implements Icon { 
	// Instansvariabler som används i programmet
	// Metoder som används i programmet
	int x,y, nbrLines;
	int rndx,rndy, rndx2, rndy2, rndWidth, rndColorRed, rndColorGreen, rndColorBlue;
	Random randomCoordinatex = new Random();
	Random randomCoordinatey = new Random();
	Random randomCoordinatex2 = new Random();
	Random randomCoordinatey2 = new Random();
	Random randomWidth = new Random();
	Random randomColorRed = new Random();
	Random randomColorGreen = new Random();
	Random randomColorBlue = new Random();
	
	public Uppgift4(int nbrLines){
		this.nbrLines = nbrLines;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		this.y = y;
		this.x = x;
		Graphics2D g2 = (Graphics2D)g;
		g.setColor(Color.BLACK);
		g.fillRect(x, y, getIconWidth(), getIconHeight());
		for(int i = 0; i < nbrLines; i++){
			rndx = randomCoordinatex.nextInt(600+1);
			rndy = randomCoordinatey.nextInt(600+1);
			rndx2 = randomCoordinatex2.nextInt(600+1);
			rndy2 = randomCoordinatey2.nextInt(600+1);
			rndWidth = 4+randomWidth.nextInt(16+1);
			rndColorRed = randomColorRed.nextInt(256);
			rndColorGreen = randomColorGreen.nextInt(256);
			rndColorBlue = randomColorBlue.nextInt(256);
			
			g2.setStroke(new BasicStroke(rndWidth));
			g2.setPaint(new Color(rndColorRed, rndColorGreen, rndColorBlue));
			g2.draw(new Line2D.Double(rndx, rndy, rndx2, rndy2));
		}
		
	}
	
	public int getIconWidth() {
		return 600; // Ersätt AAA med bildens bredd
	}
	
	public int getIconHeight() {
		return 600; // Ersätt AAA med bildens höjd
	}
	
	public static void main(String[] args) {
		IconWindow.showIcon( new Uppgift4(20) );
	}
}