package laboration8;
import java.awt.*; // Color, Font
import java.util.Calendar;
import javax.swing.ImageIcon;

public class Program8j {

    public void showImage() {
        ImageIcon spring = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/media/Spring.jpg");
        ImageIcon summer = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/media/Summer.jpg");
        ImageIcon autumn = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/media/Autumn.jpg");
        ImageIcon winter = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/media/Winter.jpg");
        PaintWindow window;
//        Text text=null;
        Calendar cal = Calendar.getInstance();
        ImageIcon image=null;

        int month = (cal.get( Calendar.MONTH ) + 1);
        switch (month) {
            case 1: case 2: case 12:
                image = winter;
                break;
            case 3: case 4: case 5:
            	image = spring;
            	break;
                // Komplettera med kod på Del 1, glöm ej break;
            case 6: case 7: case 8:
            	image = summer;
            	break;
                // Komplettera med kod på Del 1, glöm ej break;
            case 9: case 10: case 11:
            	image = autumn;
                // Komplettera med kod på Del 1, break; behövs ej
        }
    }

    public static void main(String[] args) {
        Program8j prog = new Program8j();
        prog.showImage();
    }
}
