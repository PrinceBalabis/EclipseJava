package f22;
import javax.swing.*;
import java.awt.*;

public class BlackAndWhite extends JLabel {
    public BlackAndWhite(String str) {
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
        setOpaque(true);
        setFont(new Font("SansSerif",Font.BOLD,14));
        setText(str);
    }
}
