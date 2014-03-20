package p5g1;

import java.util.Random;

public class SimpleDice implements Dice{
	private int sides;


	public SimpleDice() {
		sides = 6;
	}

	public SimpleDice(int sides) {

		if (sides>=1){
			this.sides=sides+1;
		}
		else if(sides<=0) {
			throw new NegativeSidesException("Tärningen måste minst ha 1 sida::"+sides);
		}
	}

	public int throwDice() {
		 Random generator = new Random();
         int lastResult;
         int low=1;
         lastResult= generator.nextInt(this.sides-low)+low ;
         return lastResult;
	}

	public int getSides() {
		return this.sides-1;
	}

}