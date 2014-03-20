package f22;
import javax.swing.*;

public class ColorProg1 {
    private void constructGUI() {
        JFrame frame = new JFrame("ColorProg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DemoColorPanel());
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorProg1 prog = new ColorProg1();
                prog.constructGUI();
            }
        });
    }
}
