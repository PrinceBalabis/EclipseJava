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

public class Introduction extends JPanel implements MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel titlePanel = new JPanel();
	private JPanel authorPanel = new JPanel();
	private JPanel startButtonPanel = new JPanel();
	private JPanel emptyPanel = new JPanel();
	private JButton startButton = new JButton("Press here to start game!");
	private JTextArea authorText = new JTextArea("A game made by Prince");
	private ImageIcon gameTitleGif = new ImageIcon("src/mediaFiles/titlegif.gif");
	private JLabel labelTitle = new JLabel(gameTitleGif, JLabel.CENTER);
	private int count = 1;

	@SuppressWarnings("deprecation")
	public Introduction(){
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
		startButtonPanel.add(startButton);

		// Adds panels to the main panel
		add(emptyPanel);
		add(titlePanel);
		add(authorPanel);
		add(startButtonPanel);

		// Adds listeners
		startButton.addMouseListener(this);
		startButton.addActionListener(this);

	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == startButton){
			if(count == 1){
				startButton.setText("Can't catch me?");
				startButtonPanel.setPreferredSize(new Dimension(1300, 400));
				count+=1;
			} else if(count == 2){
				startButton.setText("HAH!");
				startButtonPanel.setPreferredSize(new Dimension(200, 100));
				count+=1;
			} else if(count == 3){
				startButton.setText("u MAD Bro?");
				startButtonPanel.setPreferredSize(new Dimension(800, 100));
			}
		}
	}
	public void mouseExited(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton){
			removeAll();
		}
	}
}
