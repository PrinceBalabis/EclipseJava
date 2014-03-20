package core;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * En boundary som extends JFrame och är själva rutan för spelet. Här laddas leveln in samt får reda
 * på när leveln är färdig.
 * 
 * 
 * OBJ! Tänk på att det är inget här ni behöver röra
 * för att implementera er level! Men ändra/förbättra om ni så vill.
 * 
 * @author Prince
 *
 */
public class MainBoundary extends JFrame{
	private static final long serialVersionUID = 1L;
	private boolean levelRunningBoolean;
	JPanel panel = new JPanel();

	// JFrame settings
	public MainBoundary(){
		setTitle("Java Frame Game by Prince");
		setSize(new Dimension(800,600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void loadLevelGUI(Object level){
		this.panel.removeAll();
		this.panel = (JPanel) level;
		add(panel);
		setVisible(true);
		levelRunningBoolean = true;
		System.out.println("Successfully loaded JFrame components: " + this.panel.getComponentCount() + "...");
		while(levelRunningBoolean){
			if(this.panel.getComponentCount() == 0){
				System.out.println("Unloading level GUI components...");
				System.out.println("Current JFrame components: " + this.panel.getComponentCount() + "...");
				levelRunningBoolean = false;
			}
		}
		System.out.println("Level GUI components successfully unloaded...");
	}
	public boolean levelRunning(){
		return levelRunningBoolean;
	}
}
