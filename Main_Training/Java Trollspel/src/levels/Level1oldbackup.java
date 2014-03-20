package levels;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Level1oldbackup extends BasicGameState{
	private int state;
	private Image loading1;
	private Image loading2;
	private Image loading3;
	private Image loading4;
	private Image loading5;
	private Image loading6;
	private Image loading7;
	private Image loading8;
	private Image loading9;
	private Image loading10;
	private Image loading11;
	private Image loading12;
	private int counter = 1;
	
	public Level1oldbackup(int state){
		this.state = state;
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		loading1 = new Image("res/Level1/loadingbar/1.gif");
		loading2 = new Image("res/Level1/loadingbar/2.gif");
		loading3 = new Image("res/Level1/loadingbar/3.gif");
		loading4 = new Image("res/Level1/loadingbar/4.gif");
		loading5 = new Image("res/Level1/loadingbar/5.gif");
		loading6 = new Image("res/Level1/loadingbar/6.gif");
		loading7 = new Image("res/Level1/loadingbar/7.gif");
		loading8 = new Image("res/Level1/loadingbar/8.gif");
		loading9 = new Image("res/Level1/loadingbar/9.gif");
		loading10 = new Image("res/Level1/loadingbar/10.gif");
		loading11 = new Image("res/Level1/loadingbar/11.gif");
		loading12 = new Image("res/Level1/loadingbar/12.gif");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Wait for game to load indefinitely....", 50, 50);
		g.drawImage(loading1, 400, 300);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	public int getID() {
		return state;
	}
}
