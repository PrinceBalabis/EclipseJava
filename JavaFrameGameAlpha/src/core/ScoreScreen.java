package core;

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


public class ScoreScreen extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private JPanel lifeLeftPanel = new JPanel();
	private JPanel totalSecondsPanel = new JPanel();
	private JPanel clickAnyWhereTextPanel = new JPanel();
	private JPanel iqScore = new JPanel();
	private JButton clickAnyWhereText = new JButton("Press here to start game!");
	private JTextArea totalSeconds = new JTextArea("A game made by Prince");
	private JTextArea gameTitleGif = new JTextArea("A game made by Prince");

	@SuppressWarnings("deprecation")
	public ScoreScreen(){

		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.TRAILING));

		iqScore.setBackground(Color.WHITE);
		lifeLeftPanel.setBackground(Color.WHITE);
		totalSecondsPanel.setBackground(Color.WHITE);
		clickAnyWhereTextPanel.setBackground(Color.WHITE);
		totalSecondsPanel.disable();

		iqScore.setPreferredSize(new Dimension(800, 70));
		lifeLeftPanel.setPreferredSize(new Dimension(800, 100));
		totalSecondsPanel.setPreferredSize(new Dimension(800, 50));
		clickAnyWhereTextPanel.setPreferredSize(new Dimension(800, 300));

		lifeLeftPanel.add(lifeLeftPanel);
		totalSecondsPanel.add(totalSecondsPanel);
		clickAnyWhereTextPanel.add(clickAnyWhereText);

		add(lifeLeftPanel);
		add(iqScore);
		add(totalSecondsPanel);
		add(clickAnyWhereTextPanel);

		clickAnyWhereText.addMouseListener(this);

	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
			removeAll();
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
}
