package levels;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class MallLevel extends BasicGameState{
	private int state;
	
	public MallLevel(int state){
		this.state = state;
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
	
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	public int getID() {
		return state;
	}
}
