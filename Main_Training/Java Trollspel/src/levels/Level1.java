package levels;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.util.ResourceLoader;

import java.awt.Font;
import java.io.InputStream;

public class Level1 extends BasicGameState{
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
	private Animation animation;
	private TrueTypeFont font;
	private TrueTypeFont font2;
	private String mouse = "No input yet!";

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		initSettings();
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
		Image[] images = {loading1,loading2,loading3,loading4,loading4,loading5,loading6,loading7,loading8,loading9,loading10,loading11,loading12};
		animation = new Animation(images, 300);
		try {
			InputStream inputStream	= ResourceLoader.getResourceAsStream("res/Alllevels/font.otf");
			Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont = awtFont.deriveFont(28f); // set font size
			font = new TrueTypeFont(awtFont, true);

			InputStream inputStream2	= ResourceLoader.getResourceAsStream("res/Alllevels/font.otf");
			Font awtFont2 = Font.createFont(Font.TRUETYPE_FONT, inputStream2);
			awtFont2 = awtFont2.deriveFont(19f); // set font size
			font2 = new TrueTypeFont(awtFont2, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		renderSettings(g);
		animation.draw(340, 250);
		font.drawString(240, 210, "Vänta medan spelet laddar oändligt...", Color.black);
		font2.drawString(700, 500, "eller tryck här!", Color.darkGray);
		g.drawString(mouse, 50, 50);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		updateSettings(gc, sbg);
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "Mouse position x: " + xpos + " y: " + ypos;
		Input input = gc.getInput();// Hämtar all input från musen och tangentbordet
		if((xpos>700&&xpos<790) && (ypos>78 && ypos<94)){ // Om musen NÅR EN DEL av fönstret och KLICKAR går den till nästa TILLSTÅND
			if(input.isMouseButtonDown(0)){
				sbg.enterState(99);
			}
		} 
	}









	//Metoder och variabler nedan rörs inte
	private int state;
	private Image background;
	private Image ingameMenuRam;
	private boolean ingameMenu = false;
	public Level1(int state){
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