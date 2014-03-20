package laboration10;
import javax.swing.ImageIcon;

import laboration8.PaintWindow;

/**
 * Flytta bild i ett PaintWindow-fönster
 * @author tsroax
 */
public class Exercise10e {
    
    public void leftRight() {
    	PaintWindow window = new PaintWindow();
        ImageIcon man = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/Gubbe.jpg");
        for(int x=0; x<=500; x+=5) {
            window.showImage(man, x, 150);
            PaintWindow.pause(50);
        }
    }
    
    public void rightLeft() {
    }
        
    public void upDown() {
    }
        
    public void downUp() {
    }
    
    public static void main(String[] args) {
        Exercise10e e10e = new Exercise10e();
        e10e.leftRight();
    }
}
