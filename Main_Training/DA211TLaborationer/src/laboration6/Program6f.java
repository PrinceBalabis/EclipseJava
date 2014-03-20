package laboration6;

import javax.swing.ImageIcon;

public class Program6f {
	
public void collage() {
	PaintWindow window = new PaintWindow();
	ImageIcon image1 = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/american_express_logo_1.gif"); 
	ImageIcon image2 = new ImageIcon("/Volumes/Media Drive/JAVA/eclipseworkspace/logos-hidden-symbols-thumb45.jpg");
    window.showImage(image1, 300, 50);
    window.showImage(image2, 450, 50);
	}


public static void main(String[] args) {
	Program6f window = new Program6f();
    window.collage();
	}
}