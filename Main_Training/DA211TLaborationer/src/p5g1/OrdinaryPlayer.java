package p5g1;


import java.util.Random;
/**
 * OrdinaryPlayer-program
 * @author Hannes
 *
 */
//Klassen beräknar antalet gångeer en viss tärningsprick visas
public class OrdinaryPlayer extends Player {
	private Dice dice;
	private int result;
	//Konstruktor som tar emot namn som parameter och skapar nytt dice-objekt med 6-sidor
	public OrdinaryPlayer(String name) {
		super(name);
		dice = new SimpleDice();

	}
	//Konstruktor som tar emot namn och dice-objekt med sidor
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}
	//Sätter sidor på tärningen
	public void setDice(Dice dice) {
		this.dice = dice;

	}
	//Hämtar sidor på tärningen
	public Dice getDice() {
		return this.dice;
	}
	//Metod som kastar tärningen och beräknar hur många gånger varje tärningsprick/prickar visas
	public int throwDice() {
		Random rand = new Random();//Nytt random-objekt
		result = rand.nextInt(dice.getSides()) + 1;//Slumpmässar vilken tärningsprick som visas
		return result;//Returnar resultatet av vilken tärningsprick som visades

	}

	public static void main(String[] args) {
		SimpleDice tärning = new SimpleDice(6);
		Player spelare1 = new OrdinaryPlayer("Gustav", tärning);
		Player spelare2 = new OrdinaryPlayer("Valborg", tärning);
		Game spel = new Game(spelare1, spelare2);
		spel.play(true);
	}
}