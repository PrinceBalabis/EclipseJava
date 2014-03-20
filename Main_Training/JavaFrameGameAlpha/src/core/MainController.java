package core;
/**
 * Är en kontroller som startas av main metoden. Tar emot level-klasserna i en LevelsEntity objekt och 
 * nästa level efter varandra efter att den föregående leveln är färdig, samt startar första leveln.
 * 
 * OBJ! Tänk på att det är inget här ni behöver röra
 * för att implementera er level! Men ändra/förbättra om ni så vill.
 * 
 * @author Prince
 *
 */
public class MainController {
	private MainBoundary boundary = new MainBoundary();
	private LevelsEntity levels;
	private int pos;

	public MainController(LevelsEntity levelsEntity, int pos) {
		this.pos = pos;
		this.levels = levelsEntity;
		loadLevels();
	}

	public MainController(LevelsEntity levelsEntity) {
		pos = 0;
		this.levels = levelsEntity;
		loadLevels();
	}
	
//	 Itererar genom alla level och aktiverar dem i JFrame.
	public void loadLevels(){
		for(int i=pos; i<levels.getAmountLevels(); i++){
			System.out.println("Loading new level components...");
			boundary.loadLevelGUI(levels.getLevel(i));
			while(boundary.levelRunning()){}
			
			
			//score screen
//			new ScoreScreen();
			
			
		}
	}

//	 Ladda livräknaren
//	public void LifeCounter(){
//	}
}
