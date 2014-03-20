package laboration10;
import javax.swing.ImageIcon;

import laboration8.PaintWindow;

/**
 * Flytta bild i ett PaintWindow-fönster
 * @author tsroax
 */
public class Exercise10f1 {
    
    public void leftRight() {
    }
    
    public void rightLeft() {
    	PaintWindow window = new PaintWindow();
        ImageIcon man = new ImageIcon("src/laboration10/Gubbe.jpg");
        for(int x=500; x<=500; x-=5) {
            window.showImage(man, x, 150);
            PaintWindow.pause(50);
        }
    }
        
    public void upDown() {
    }
        
    public void downUp() {
    }
    
    public static void main(String[] args) {
        Exercise10f1 e10e = new Exercise10f1();
        e10e.rightLeft();
    }
}
