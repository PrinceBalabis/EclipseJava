package p5;

import java.util.Random;

/**
 * 
 * Representerar en spelare som fuskar.
 * @author Prince
 *
 */
public class Cheater extends Player{
	
	private Dice dice;
	private Random rand = new Random();
	private int throwNbr;
	
	/**
	 * När Cheater-klassen objektdeklereras krävs minst en sträng som bestämmer fuskarens namn. Automatiskt skapas en Dice-objekt
	 * som refererar till en SimpleDice-objekt. Detta för att skapa en tärning med 6 sidor.
	 * @param name Spelarens namn.
	 */
	public Cheater(String name) {
		super(name);
		this.dice = new SimpleDice();
	}

	/**
	 * När Cheater-klassen objektdeklereras med en sträng och Dice-objekt i parametern, skapas en fuskare med namn av strängens värde
	 * och önskad värde av tärningens sidor i Dice-objektet.
	 * @param name
	 * @param dice
	 */
	public Cheater(String name, Dice dice){
		super(name);
		this.dice = dice;
	}
	
	/**
	 * Ändrar Dice-objektets mängd med sidor.
	 * @param dice Dice-objekt 
	 */
	public void setDice(Dice dice){
		this.dice = dice;
	}
	
	/**
	 * Returnerar Dice-objektet.
	 * @return dice
	 */
	public Dice getDice(){
		return dice;
	}

	/**
	 * Kastar tärningen och returnerar en slumpmässig sida.
	 * @return throwNbr Int-värde med slumpmässig sida returneras.
	 */
	public int throwDice() {
		throwNbr = rand.nextInt(dice.getSides())+1;
		
		if(rand.nextInt(2) == 1 && throwNbr != dice.getSides() ){
			throwNbr++;
		}
		
		return throwNbr;
	}
}
