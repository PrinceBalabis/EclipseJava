package core;

import levels.*;

/**
 * Hur man integrerar sin level:
 * Steg 1. Deklarera och instansiera din level/klass, se till att din class ligger i "levels"-paketet.
 * Steg 2. Lägg till din class med "levels.addlevel()"-metoden
 * 
 * Direkttesta din level: använd "new MainController(levels, [int-värdet på din level])", kolla längst ner på klassen
 * @author Prince
 *
 */
public class MainMethod {
	public static void main(String[] args) {
		LevelsEntity levels = new LevelsEntity();

		// Steg 1: Deklarera och instansiera din class här, se till att din class ligger i "levels"-paketet.
		ScoreScreen intro = new ScoreScreen();
		Level1 lvl1 = new Level1();
		Outroduction outro = new Outroduction();

		// Steg 2: Lägg till din class med addlevel-metoden, någonstans mellan intro eller outtro.
//		levels.addLevel(intro);
//		levels.addLevel(lvl1);
		// Lägg till level före outtro
		levels.addLevel(outro);

		// Level-prövning: Kommentera bort instruktionen och ändra nollan i parametern
		// till den level du vill direkt starta vid uppstart av spelet.
		// Glöm ej kommentera bort det andra kommandot längst ner
//				new MainController(levels, 0);
		new MainController(levels);
	}
}