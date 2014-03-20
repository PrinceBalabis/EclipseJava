package levels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Level1 extends JPanel implements MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel loadingBarPanel = new JPanel();
	private JPanel loadingTextPanel = new JPanel();
	private JPanel secretPanel = new JPanel();
	private JPanel emptyPanel = new JPanel();
	private JTextArea secret = new JTextArea("Or press here....");
	private JTextArea loadingText = new JTextArea("Loading...");
	private JTextArea loadingText2 = new JTextArea("wait for this awesome game to load...");
	private ImageIcon loadingBar = new ImageIcon("src/mediaFiles/load.gif");
	private JLabel labelTitle = new JLabel(loadingBar, JLabel.CENTER);
	private Font font = new Font("Verdana", Font.ITALIC, 8);
	

	@SuppressWarnings("deprecation")
	public Level1(){
		// Creates and sets the main panel
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.TRAILING));

		// Sets background colors to panels
		secret.setFont(font);
		secret.setForeground(Color.GRAY);
		emptyPanel.setBackground(Color.WHITE);
		loadingBarPanel.setBackground(Color.WHITE);
		loadingTextPanel.setBackground(Color.WHITE);
		secretPanel.setBackground(Color.WHITE);
		loadingText.disable();
		loadingText2.disable();
		secret.disable();

		// Sets sizes to panels
		emptyPanel.setPreferredSize(new Dimension(800, 300));
		loadingBarPanel.setPreferredSize(new Dimension(800, 100));
		loadingTextPanel.setPreferredSize(new Dimension(800, 100));
		secretPanel.setPreferredSize(new Dimension(100, 300));

		// Adds components to their panels
		loadingBarPanel.add(labelTitle);
		loadingTextPanel.add(loadingText);
		loadingTextPanel.add(loadingText2);
		secretPanel.add(secret);

		// Adds panels to the main panel
		add(emptyPanel);
		add(loadingBarPanel);
		add(loadingTextPanel);
		add(secretPanel);
		// Adds listeners
		secret.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == secret){
			secret.setText("yay");
		}
	}
	public void mousePressed(MouseEvent e) {

	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {

	}
	public void mouseExited(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == secret){
			removeAll();
		}
	}
}
