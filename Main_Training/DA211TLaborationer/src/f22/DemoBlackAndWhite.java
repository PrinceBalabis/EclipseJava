package f22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoBlackAndWhite extends JPanel implements ActionListener {
    private ColorPanel pnlColor = new ColorPanel();
    private BlackAndWhite lblValues = new BlackAndWhite(" ");
    private JButton btnResult = new JButton("Visa värden och färg");
    
    public DemoBlackAndWhite() {
        setLayout(new BorderLayout(10,10));
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
