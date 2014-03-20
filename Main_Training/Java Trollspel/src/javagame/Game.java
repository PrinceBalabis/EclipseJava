package javagame;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.newdawn.slick.*;

import org.newdawn.slick.state.*;
public class Game extends StateBasedGame{
	private static final String gamename = " Java Trollspel av Prince v0.1";
	private LevelsList ll = new LevelsList();

	public Game(String gamename) {
		super(gamename);	
		this.addState(new ScoreScreen(99));
		for(int i=0; i<ll.getAmountLevels(); i++){
			this.addState(ll.getLevel(i));
		}
	}

	/**
	 * Initierar två tillstånder
	 */
	public void initStatesList(GameContainer gc) throws SlickException {
		for(int i=0;i<ll.getAmountLevels(); i++){
			this.getState(i).init(gc, this);
		}
		this.enterState(0); // Starta menu vid start av spelet
	}

	public static void main(String[] args) {
		try{
			AppGameContainer appgc = new AppGameContainer(new Game(gamename));// Skapar ett fönster som håller ett spel(Game-klassen), och ger spelet ett namn
			appgc.setShowFPS(false);
			appgc.setVSync(true);
			appgc.setDisplayMode(800, 600, false);// Sätter upplösningen och gör den inte till fullskärm.
			appgc.start();// Startar fönstret
		}catch(SlickException e){e.printStackTrace();}
	}
}