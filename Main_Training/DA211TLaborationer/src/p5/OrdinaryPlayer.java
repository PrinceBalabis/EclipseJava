package p5;

import java.util.Random;

/**
 * 
 * Representerar en vanlig spelare.
 * @author Prince
 *
 */
public class OrdinaryPlayer extends Player{
	private Dice dice;
	Random rand = new Random();
	
	/**
	 * När klassen objektdeklereras med en sträng skapas en spelare med namnet av strängens värde och en tärning med 6 sidor.
	 * @param name En sträng vilken ska vara spelarens namn.
	 */
	public OrdinaryPlayer(String name) {
		super(name);
		this.dice = new SimpleDice();
	}

	/**
	 * När OrdinaryPlayer objektdeklereras med en sträng och en Dice-objekt 
	 * @param name En sträng vilken ska vara spelarens namn.
	 * @param dice	En Diceobjekt vilken ska bestämma antalet av tärningens sidor.
	 */
	public OrdinaryPlayer(String name, Dice dice){
		super(name);
		this.dice = dice;
	}
	
	/**
	 * Ändrar tärningens sidor.
	 * @param dice Ändra tärningens sidor.
	 */
	public void setDice(Dice dice){
		this.dice = dice;
	}
	
	/**
	 * Returnerar tärningens sidor.
	 * @return Dice Returnerar tärningens sidor.
	 */
	public Dice getDice(){
		return dice;
	}
	
	/**
	 * Kastar tärningen och returnerar sidor.
	 */
	public int throwDice() {
		return rand.nextInt(dice.getSides())+1;
	}
}
