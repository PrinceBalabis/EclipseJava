package p5;

import java.util.Random;

/**
 * Räknar ut hur många gånger var sida på tärningen som visar. Tar vara på 
 * OrdinaryPlayer och Cheater.
 * @author Prince
 *
 */
public class TestDice {
	
	private static int[] res;
	private static String print;
	private static Random rand = new Random();
	
	/**
	 * När man kör test med ett Dice-objekt och ett int-värde i parametern används Dice-objektet för att
	 * bestämma tärningens sidor och int-värdet för att bestämma antalet tärningskast.
	 * @param dice Ett Dice-objekt med tärningens mängd med sidor.
	 * @param nbrOfThrows Antalet kast med tärningen som ska göras.
	 */
	public static void test(Dice dice, int nbrOfThrows){
	
		res = new int[dice.getSides()];
		
		for(int i = 0; i<=nbrOfThrows; i++){
			res[rand.nextInt(res.length)] += 1;
		}
		
		for(int i = 0; i<res.length; i++){
			print = i+1 + "     " + res[i];
			TextWindow.println(print);
		}
	}
	/**
	 * När man kör test-metoden med Ett Player-objekt och ett int-värde i parametern används Player-objektet för att
	 * bestämma tärningens sidor och int-värdet för att bestämma antalet tärningskast.
	 * @param player Player-objekt för att bestämma tärningens sidor.
	 * @param nbrOfThrows int-värde för att bestämma antalet kast med tärningen.
	 */
	public static void test( Player player, int nbrOfThrows ){
		if(player instanceof OrdinaryPlayer){
			player = new OrdinaryPlayer(player.getName(), ((OrdinaryPlayer) player).getDice());
			res = new int[((OrdinaryPlayer) player).getDice().getSides()];
			for(int i = 0; i<=nbrOfThrows; i++){
				res[((OrdinaryPlayer) player).throwDice()-1] += 1;
			}
		} else {
			player = new Cheater(player.getName(), ((Cheater) player).getDice());
			res = new int[((Cheater) player).getDice().getSides()];
			for(int i = 0; i<=nbrOfThrows; i++){
				res[((Cheater) player).throwDice()-1] += 1;
			}
		}

		for(int i = 0; i<res.length; i++){
			print = i+1 + "     " + res[i];
			TextWindow.println(print);
		}
	}
}
