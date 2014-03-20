package p1;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {
	
    /*
     * Metoden ber√§knar totala biljettpriset och det genomsnittliga
     * biljettpriset f√∂r ett antal vuxna, barn och pension√§rer.
     **/	
	public void exercise1a() {
	    // Deklaration av variabler som används i programmet
		int adults, childrens, pensioners, priceadults, pricechildren, pricepensioners, total, average;
		
		// Användaren matar in antalet vuxna, barn och pensioörer. Lagras i ’adults', 'children' och 'pensioners’
		adults = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antalet vuxna."));
		childrens = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antalet barn."));
		pensioners = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antalet pensionärer."));
		
		//Beräkning av priset på vuxna, barn och pensionärer. Lagras i 'priceadults', 'pricechildren' och 'pricepensioners'
		priceadults = adults * 110;
		pricechildren = childrens * 60;
		pricepensioners = pensioners * 80;
		
		//Totala priset och genomsnittspriset lagras i 'total' och 'average'
		total = priceadults + pricechildren + pricepensioners;
		average = total/3;
		
		//Meddelar totala värdet och genomsnittsvärdet till användaren.
		JOptionPane.showMessageDialog(null, "Totala priset är: " + total + " kr." + "\n" + "Genomsnittspriset är: " + average + " kr.");
	}
	

	public void exercise1b() {	// public void exercise1b() {...}
		for( int uddatal = 1 ; uddatal <= 100 ; ) { // Initialisering av "for-loopen", där talet '1' lagras i variabeln 'start', 
		// -och säger till for-loopen att fortsätta tills 'start' når 100.
			if( true ) {
				System.out.print( uddatal + " " ); //Programmet skriver ut värdet 'start' i konsolen efter varje loop.
			}
			uddatal += 2; //Ökas med 2 varje repetition.
		}
	}
	

	public void exercise1c() {	// public void exercise1c() {...}
		for( int count = 0 ; count < 4 ; count++ ) { //Initialisering av for-loopen, där man deklarerar 'start' som en variabel och lagrar '0'. 
		//Man säger även till programmet att öka med 1-värde i fyra loopar.
			if( true ) {
				int wholenumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Mata in ett heltal.")); // Frågar efter ett integer-värde med JOptionPane-dialogen.
		        if (wholenumber >= 1) { // Om talet är större än noll så meddelar programmet att talet är positivt.
		            System.out.print("Talet " + wholenumber + " är positivt. \n");
		        } else if (wholenumber == 0) { // Är talet 0 så meddelas att talet är noll.
		        	System.out.print("Talet " + wholenumber + " är noll. \n");
		        } else if (wholenumber <= -1) { // Är talet mindre än 0 så meddelas att talet är negativt.
		        	System.out.print("Talet " + wholenumber + " är negativt. \n");
		        }
			}
		}
	}
	

	public void exercise1d() { 	// public void exercise1d() {...}
		int min = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange minsta värdet.")); //Frågar efter det minsta värdet.
		int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange högsta värdet.")); //Frågar efter det högsta värdet.
		System.out.println("Minsta värdet: " + min + "," + "         " + "Högsta värdet: " + max); // Skriver ut minsta och högsta värdet.
		System.out.println(); //Gör konsolen snyggare med mellanrum.
		
		for(; min <= max ; ) { // Initialisern av for-loopen. Ska loopas tills 'min' är större än 'max'.
			if( min <= (max-7) ) { // Satsen knuten till if-satsen ska repeteras tills det minsta värdet är 7 värden under det högsta.
				System.out.print( min + ", " ); // Skriver ut värdet 'min' med komma.
			} else {
				System.out.print( min + " " ); // Skriver ut det sista värdet 'min' i konsolen utan komma.
			}
			min += 7; // Ökas med 7 i variabeln 'min' efter varje loop.
		}
	}
		
	
	// public void exercise1e() {...}
	public void exercise1e() {
		PaintWindow pw = new PaintWindow(); // Skapar ett PaintPindow-objekt.
		Random rand = new Random(); // Skapar ett Random-objekt.
		ImageIcon image = new ImageIcon("/Users/Stevie/EclipseWorkspace/P1/gubbe.jpg"); // Skapar ett image-objekt.
		int width = pw.getBackgroundWidth(); // Lagrar Paintwindow-bredden i 'width' i en variabel.
		int height = pw.getBackgroundHeight();// Lagrar Paintwindow-höjden i 'width' i en variabel.
		int dx = -3; // Deklarerar en variabel som bestämmer 'Image' hastighet i x-axeln.
		int dy = 0; //  Deklarerar en variabel som bestämmer 'Image' hastighet i y-axeln.
		int x = 250; // Bestämmer startpositionen på 'image' i 'pw'(PaintWindow-objektet) när programmet startar.
		int y = rand.nextInt(height-99);  // Bildens höjd är 100
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y); // Visar bilden
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx; // Varje 20ms flyttar bilden med 'dx'-pixlar, ger rörelse till bilden, alltså -3 pixlar varje 20ms sidleds.
			y += dy; // Varje 20ms flyttar bilden med 'dy'-pixlar, ger rörelse till bilden. Eftersom 'dx = 0' så rör sig inte bilden i y-axeln.
			if(x<0) { // Om 'image'(gubbe.jpg) träffar vänster sida på 'pw'(PaintWindow) då studsar den och färdas andra hållet. 
				dx *= -1;
			}
			if(x>width-100) // Om 'image'(gubbe.jpg) träffar höger sida på 'pw'(PaintWindow) då studsar den och färdas andra hållet. 
				dx *= -1;
			}
		}
	
	
	// public void exercise1f() {...}
	public void exercise1f() {
		PaintWindow pw = new PaintWindow(); // Skapar ett PaintPindow-objekt.
		Random rand = new Random(); // Skapar ett Random-objekt.
		ImageIcon image = new ImageIcon("gubbe.jpg"); // Skapar ett image-objekt.
		int width = pw.getBackgroundWidth(); // Lagrar Paintwindow-bredden i 'width' i en variabel.
		int height = pw.getBackgroundHeight(); // Lagrar Paintwindow-höjden i 'height' i en variabel.
		int dx = rand.nextInt(6) - 3; // Deklarerar en variabel som bestämmer 'Image' hastighet i x-axeln, används med Random-objektet
		int dy = rand.nextInt(6) - 3; // Deklarerar en variabel som bestämmer 'Image' hastighet i y-axeln, används med Random-objektet
		int x = rand.nextInt(width-99); // Bestämmer startpositionen på 'image' i 'pw'(PaintWindow-objektet) när programmet startar.
		int y = rand.nextInt(height-99);  // Bestämmer startpositionen på 'image' i 'pw'(PaintWindow-objektet) när programmet startar.
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y); // Visar bilden 'image'(gubbe.jpg) i 'pw'(PaintWindow).
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx; // Varje 20ms flyttar bilden med 'dx'-pixlar, ger rörelse till bilden
			y += dy; // Varje 20ms flyttar bilden med 'dy'-pixlar, ger rörelse till bilden
			if(x<0) { // Om 'image'(gubbe.jpg) träffar vänster sida på 'pw'(PaintWindow) då studsar den. 
				dx *= -1;
			} else if(x>width-100) { // Om 'image'(gubbe.jpg) träffar höger sida på 'pw'(PaintWindow) då studsar den. 
				dx *= -1;
			}
			if(y<0) {  // Om 'image'(gubbe.jpg) träffar taket på 'pw'(PaintWindow) då studsar den. 
				dy *= -1;
			} else if(y>height-100) {  // Om 'image'(gubbe.jpg) träffar botten-sidan på 'pw'(PaintWindow) då studsar den. 
				dy *= -1;
			}
		}
	}
}
