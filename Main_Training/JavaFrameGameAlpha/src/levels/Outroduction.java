package levels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Startsidan till spelet, så att säga "Level 0". 
 * Utgå gärna från denna om ni vill när ni bygger er level.
 * 
 * 
 * OBJ! Tänk på att det är inget här ni behöver röra
 * för att implementera er level! Men ändra/förbättra om ni så vill.
 * 
 * @author Prince
 *
 */

public class Outroduction extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel = new JPanel();
	private JPanel authorPanel = new JPanel();
	private JPanel startButtonPanel = new JPanel();
	private JPanel emptyPanel = new JPanel();
	private JTextArea outtro = new JTextArea("Thanks for playing this game!");
	private JTextArea authorText = new JTextArea("A game made by Prince");
	private ImageIcon gameTitleGif = new ImageIcon("src/mediaFiles/titlegif.gif");
	private JLabel labelTitle = new JLabel(gameTitleGif, JLabel.CENTER);

	@SuppressWarnings("deprecation")
	public Outroduction(){
		// Creates and sets the main panel
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.TRAILING));

		// Sets background colors to panels
		emptyPanel.setBackground(Color.WHITE);
		titlePanel.setBackground(Color.WHITE);
		authorPanel.setBackground(Color.WHITE);
		startButtonPanel.setBackground(Color.WHITE);
		authorText.disable();

		// Sets sizes to panels
		emptyPanel.setPreferredSize(new Dimension(800, 70));
		titlePanel.setPreferredSize(new Dimension(800, 100));
		authorPanel.setPreferredSize(new Dimension(800, 50));
		startButtonPanel.setPreferredSize(new Dimension(800, 300));

		// Adds components to their panels
		titlePanel.add(labelTitle);
		authorPanel.add(authorText);
		startButtonPanel.add(outtro);

		// Adds panels to the main panel
		add(emptyPanel);
		add(titlePanel);
		add(authorPanel);
		add(startButtonPanel);
	}
}
