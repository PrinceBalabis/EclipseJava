package levels;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class ExampleLevel extends BasicGameState{
	private int state;
	private String mouse = "No input yet!";

	// Variabler för att flytta en bild runt skärmen med tangenterna
	private Image image1;
	private int image1X = 200;
	private int image1Y = 200;

	public ExampleLevel(int state){
		this.state = state;
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		image1 = new Image("res/Example/1.jpg");
	}

	// Ritar objekt på rutan
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString(mouse, 50, 50); // Ritar en text
		g.drawRect(50, 100, 60, 120); // Ritar en rektangel
		g.drawImage(image1, image1X, image1Y);//Ritar en bild
	}

	//Uppdaterar rutan
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		// Hämtar X och Y positioner på spelskärmen och skriver ut det på skärmen
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "Mouse position x: " + xpos + " y: " + ypos;
		Input input = gc.getInput();// Hämtar all input från musen och tangentbordet
		if(input.isKeyDown(Input.KEY_UP)){image1Y -= 1;} // Flyttar bilden upp om piltangent upp är tryckt
		if((xpos>1&&xpos<799) && (ypos>1 && ypos<799)){ // Om musen NÅR EN DEL av fönstret och KLICKAR går den till nästa TILLSTÅND
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		} 
	}

	// Returnerar tillstånds-ID
	public int getID() {
		return state;
	}
}