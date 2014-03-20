package laboration10;
import javax.swing.ImageIcon;

import laboration8.PaintWindow;

/**
 * Flytta bild i ett PaintWindow-fönster
 * @author tsroax
 */
public class Exercise10f3 {
    
    public void leftRight() {
    }
    
    public void rightLeft() {
    }
        
    public void upDown() {
    	PaintWindow window = new PaintWindow();
        ImageIcon man = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/Gubbe.jpg");
        for(int y=0; y<=300; y+=5) {
            window.showImage(man, 300, y);
            PaintWindow.pause(50);
        }
    }
        
    public void downUp() {
    }
    
    public static void main(String[] args) {
        Exercise10f3 e10e = new Exercise10f3();
        e10e.upDown();
    }
}
