package p5g1;

public interface Dice {
	/*
	 * Kastar tärningen en gång och returnerar resultatet.
	 * 
	 * @returns Antalet prickar som tärningen visar vid kastet
	 */
	public int throwDice();

	/*
	 * Returnerar antalet sidor som tärningen har
	 * 
	 * @returns Antalet sidor på tärningen
	 */
	public int getSides();
}
