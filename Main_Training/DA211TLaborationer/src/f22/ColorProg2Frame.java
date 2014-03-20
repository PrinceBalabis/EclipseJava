package f22;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ColorProg2Frame extends JFrame {    
    private void constructGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new DemoBlackAndWhite());
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorProg2Frame prog = new ColorProg2Frame();
                prog.constructGUI();
            }
        });
    }
}
