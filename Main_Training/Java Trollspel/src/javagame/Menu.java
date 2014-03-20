package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	private int state;
	private Image titel;
	private Image backgrund;
	private Image spelanu;
	private Image instruktioner;
	private Image avsluta;
	private Image instruktionsRam;
	private boolean instructionMenu = false;

	public Menu(int state){
		this.state = state;
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		titel = new Image("res/Menu/titel.gif");
		backgrund = new Image("res/Menu/backgrund.png");
		spelanu = new Image("res/Menu/spelanu.png");
		instruktioner = new Image("res/Menu/instruktioner.png");
		avsluta = new Image("res/Menu/avsluta.png");
		instruktionsRam = new Image("res/Alllevels/ram.png");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(backgrund, 0, 0);
		g.drawImage(titel, 165, 30);
		g.drawImage(spelanu, 130, 525);
		g.drawImage(instruktioner, 300, 525);
		g.drawImage(avsluta, 520, 525);
		g.drawString("av Prince", 358, 75);

		if(instructionMenu==true){
			g.drawImage(instruktionsRam, 125, 80);
			g.drawString("Hur man spelar:", 350, 200);
			g.drawString("Använd musen, tangentbordet och din hjärna\nför att lösa de spelets pussel!", 230, 240);
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		Input input = gc.getInput();
		if((xpos>130&&xpos<260) && (ypos>33 && ypos<69)){
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
				try{
					Thread.sleep(250);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		if((xpos>300&&xpos<470) && (ypos>33 && ypos<69)){
			if(input.isMousePressed(0)){
				if(instructionMenu==false){
					instructionMenu=true;
				} else{
					instructionMenu=false;
				}
			}
		}
		if((xpos>520&&xpos<700) && (ypos>33 && ypos<69)){
			if(input.isMouseButtonDown(0)){
				System.exit(0);
			}
		}
	}

	public int getID() {
		return state;
	}
}