package javagame;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.util.ResourceLoader;

public class ScoreScreen extends BasicGameState{
	private String levelnumber;
	private TrueTypeFont font;

	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException {
		initSettings();
		try {
			InputStream inputStream	= ResourceLoader.getResourceAsStream("res/Alllevels/font.otf");
			Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont = awtFont.deriveFont(38f); // set font size
			font = new TrueTypeFont(awtFont, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException {
		renderSettings(g);
		font.drawString(300, 300, "Gratulerar!");
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException {
		updateSettings(gc, sbg);

	}











	//Metoder och variabler nedan rörs inte
	private int state;
	private Image background;
	private Image ingameMenuRam;
	private boolean ingameMenu = false;
	public ScoreScreen(int state){
		this.state = state;
	}
	private void initSettings() throws SlickException{
		background = new Image("res/AllLevels/background.png");
		ingameMenuRam = new Image("res/AllLevels/ram.png");
	}
	private void renderSettings(Graphics g){
		g.drawImage(background, 0, 0);//Ritar bakgrunden
		if(ingameMenu==true){
			g.drawImage(ingameMenuRam, 125, 80);//Ritar en bild
			g.drawString("Paus", 370, 190);
			g.drawString("Fortsätt spel(Tryck R)", 300, 220);
			g.drawString("Gå till meny(Tryck M)", 300, 250);
			g.drawString("Avsluta spel(Tryck Q)", 300, 280);
		}
	}
	private void updateSettings(GameContainer gc, StateBasedGame sbg){
		Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			ingameMenu = true;
		}
		if(ingameMenu==true){
			if(input.isKeyDown(Input.KEY_R)){
				ingameMenu = false;
			}
			if(input.isKeyDown(Input.KEY_M)){
				ingameMenu = false;
				sbg.enterState(0);
				try{
					Thread.sleep(250);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			if(input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
	}
	public int getID() {
		return state;
	}
}
