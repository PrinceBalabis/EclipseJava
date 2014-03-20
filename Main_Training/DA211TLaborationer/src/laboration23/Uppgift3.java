package laboration23;
import java.awt.*;
import java.awt.geom.*;  // Behövs vid anrop till draw/fill
import javax.swing.*;  // Behövs om du ska använda bilder
import java.awt.image.*;  // Behövs om du ska använda bilder
 
public class Uppgift3 implements Icon { 
	// Instansvariabler som används i programmet
	// Metoder som används i programmet
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		//Graphics2D g2 = (Graphics2D)g; // Uppgift 4, 5 och 5
		//Ritkommandon, metodanrop mm här
		g.setColor(Color.RED);
		g.fillOval(73, 234, 123, 54);
		g.setColor(Color.BLUE);
		g.fillRect(345, 452, 150, 79);
	}
	
	public int getIconWidth() {
		return 600; // Ersätt AAA med bildens bredd
	}
	
	public int getIconHeight() {
		return 600; // Ersätt AAA med bildens höjd
	}
	
	public static void main(String[] args) {
		IconWindow.showIcon( new Uppgift3() );
	}
}