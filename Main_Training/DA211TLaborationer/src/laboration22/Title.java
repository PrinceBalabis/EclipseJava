package laboration22;

import javax.swing.*;
import java.awt.*;

public class Title extends JLabel { 
	public Title(String content, int style, int fontsize, Color text, Color background) {
		Font font = new Font("Dialog", style, fontsize);
		setText(content);
		setHorizontalAlignment(JLabel.CENTER);
		setFont(font);
		setBackground(background);
		setOpaque(true);
		setForeground(text);
	}
}