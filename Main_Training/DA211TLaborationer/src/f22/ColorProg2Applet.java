package f22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorProg2Applet extends JApplet {
    private void constructGUI() {
        this.setSize(300,200); // anger storlek i AppletViewer, ej i browser
        this.add(new DemoBlackAndWhite(), BorderLayout.CENTER);
    }
    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    constructGUI();
                }
            });
        } catch (Exception e) {}
    }
}
