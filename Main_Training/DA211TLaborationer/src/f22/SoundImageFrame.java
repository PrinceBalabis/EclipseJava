package f22;
import javax.swing.*;

public class SoundImageFrame extends JFrame {
    private void constructGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new SoundImagePanel1());
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SoundImageFrame prog = new SoundImageFrame();
                prog.constructGUI();
            }
        });
    }

}
