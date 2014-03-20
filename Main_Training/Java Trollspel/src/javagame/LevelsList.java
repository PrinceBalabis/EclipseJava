package javagame;

import org.newdawn.slick.state.*;
import levels.*;

public class LevelsList {
	private LevelsMapper lm = new LevelsMapper();
	private int counter = 0;
	
	// Lägg till din bana här med metoden lm.addLevel(), glöm inte lägga till getLevelNumber()-metoden i parametern
	public LevelsList(){
		lm.addLevel(new Menu(getLevelNumber()));
		lm.addLevel(new Level1(getLevelNumber()));
	}

	public int getAmountLevels(){
		return lm.getAmountLevels();
	}

	public GameState getLevel(int level){
		return lm.getLevel(level);
	}

	private int getLevelNumber(){
		return counter++;
	}
}