package f22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoColorPanel extends JPanel implements ActionListener {
    private ColorPanel pnlColor = new ColorPanel();
    private JLabel lblValues = new JLabel(" ");
    private JButton btnResult = new JButton("Visa värden och färg");
    
    public DemoColorPanel() {
        setLayout(new BorderLayout(10,10));
        lblValues.setFont(new Font("SansSerif",Font.PLAIN,14));
        btnResult.addActionListener(this);
        add(lblValues,BorderLayout.NORTH);
        add(pnlColor,BorderLayout.CENTER);
        add(btnResult,BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e) {
        Color color = pnlColor.getColor();
        lblValues.setText(color.toString());
        btnResult.setBackground(color);
        
    }
}
