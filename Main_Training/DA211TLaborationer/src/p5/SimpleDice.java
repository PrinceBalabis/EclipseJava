package p5;

import java.util.Random;

/**
 * 
 * En tärning som kan kastas och returnera antalet sidor.
 * @author Prince
 *
 */

public class SimpleDice implements Dice{
	private int sides;
	private Random rand = new Random();
	
	/**
	 * När klassen SimpleDice objektdeklereras skapas en enkel tärning med 6 sidor.
	 */
	public SimpleDice(){
		sides = 6;
	}
	
	/**
	 * När klassen SimpleDice objektdeklereras med ett int-variabel i parametern skapas en simpel tärning med sidor av int-ens värde.
	 * @param sides Bestämmer antalet sidor på tärningen.
	 */
	public SimpleDice(int sides){
		if(sides<=0){
			throw new NegativeSidesException();
		} else{
			this.sides = sides;
		}
	}
	/**
	 * Kastar tärningen och returnerar sidan.
	 */
	public int throwDice() {
		return rand.nextInt(sides)+1;
	}

	/**
	 * Returnerar tärningens antalet sidor.
	 */
	public int getSides() {
		return sides;
	}
}
