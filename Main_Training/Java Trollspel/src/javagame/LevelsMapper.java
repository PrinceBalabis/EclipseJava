package javagame;

import java.util.HashMap;
import org.newdawn.slick.state.*;

/**
 * En entityklass som har en hashmap, i denna hashmappen lagras levlarna, för att enklare kunna
 * nå dem genom "getLevel"-metoden.
 * 
 * OBJ! Tänk på att det är inget här ni behöver röra
 * för att implementera er level! Men ändra/förbättra om ni så vill.
 * 
 * 
 * @author Prince
 *
 */

public class LevelsMapper {
	private HashMap<Integer, Object> levels = new HashMap<Integer, Object>();
	private int totalAmountLevels = 0;

	public void addLevel(Object level){
		levels.put(totalAmountLevels, level);
		totalAmountLevels++;
	}

	public int getAmountLevels(){
		return totalAmountLevels;
	}
	
	public GameState getLevel(int level){
		return (GameState) levels.get(level);
	}
}