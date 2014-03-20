package f22;
import javax.swing.*;

public class ColorProg2 {
    private void constructGUI() {
        JFrame frame = new JFrame("ColorProg2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DemoBlackAndWhite());
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorProg2 prog = new ColorProg2();
                prog.constructGUI();
            }
        });
    }
}
