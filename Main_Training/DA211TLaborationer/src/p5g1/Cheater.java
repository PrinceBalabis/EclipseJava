package p5g1;

import java.util.Random;

/**
 * Klassen Cheater representerar en spelare som fuskar. Lägger till en prick på
 * tärningen vid hälften av gångerna förutom vid slaget max slag.
 * 
 * @author Hannes Cederholm
 */

public class Cheater extends Player {
	Dice dice;

	/**
	 * Konstruktor vid användning av 6-sidig tärning. Parameter av typen String
	 * läses in.
	 */
	public Cheater(String name) {
		super(name);

	}

	/**
	 * Konstruktor som används när användaren väljer antalet sidor tärningen
	 * skall ha. Parameter av typen String och Dice löses in.
	 */
	public Cheater(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}

	/**
	 * Metoden setDice är en set-metod för dice.
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * Metoden setDice är en get-metod för dice.
	 */
	public Dice getDice() {
		return dice;
	}

	/**
	 * Metoden för att kasta tärning. Fuskar ca vid hälften av kasten förutom
	 * när du slagit max med tärningen.
	 */
	public int throwDice() {
		Random rand = new Random();
		int nbrOfDots = dice.throwDice();
		if (nbrOfDots == dice.getSides()) {
			return nbrOfDots;
		}
		return (nbrOfDots + rand.nextInt(2));
	}
}
