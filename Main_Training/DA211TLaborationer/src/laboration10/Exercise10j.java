package laboration10;

	import java.awt.*;
	import java.util.Random;
	import laboration8.PaintWindow;

public class Exercise10j {
    public void randomLines() {
        PaintWindow pw = new PaintWindow();
        Random rand = new Random();
        int x1, y1, x2, y2, width; 
        Color color;
        int maxwidth = pw.getBackgroundWidth();
        int maxheight = pw.getBackgroundHeight();
        pw.fillRect(0, 0, maxwidth, maxheight, Color.BLACK);
        
        for(int i = 20 ; i > 0 ; i--) {
            x1 = rand.nextInt(maxwidth - 10 + 1);
            y1 = rand.nextInt(maxheight - 10 + 1);
            x2 = rand.nextInt(maxwidth - 10 + 1);
            y2 = rand.nextInt(maxheight - 10 + 1);
            width = rand.nextInt(17) + 4;
            color = new Color( rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            pw.line(x1, y1, x2, y2, color, width);
        }
}
    public static void main(String[] args) {
        Exercise10j u10j = new Exercise10j();
        u10j.randomLines();
} }