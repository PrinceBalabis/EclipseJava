package p5g1;

public class TestDice {

	public static void test(Dice dice, int nbrOfThrows) {

		int[] res = new int[dice.getSides() + 1];
		// initialisera res(k) till 0.
		for (int k = 0; k < res.length; k++)
			res[k] = 0;

		// Kasta tärningen nbrOfThrows gånger och håll koll på antalet med res
		for (int i = 0; i < nbrOfThrows; i++) {
			// aThrow =

			//  antalet prickar i kastet.
			res[dice.throwDice()]++;
		}
		for (int i = 1; i < res.length; i++) {
			System.out.println(String.format("%-4s%10d", (i), res[i]));
		}
	}

	public static void test(Player player, int nbrOfThrows) {
		player.throwDice();

	}

	public static void main(String[] args) {
		TestDice.test(new SimpleDice(6), 1000000);
		System.out.println();
		TestDice.test(new SimpleDice(4), 1000000);

		TestDice.test(new OrdinaryPlayer("Rut", new SimpleDice(6)), 1000000);
		System.out.println();
		TestDice.test(new Cheater("Fuffe", new SimpleDice(6)), 1000000);
	}
}