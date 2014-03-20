package laboration17;

import javax.swing.JOptionPane;

public class Controller {
	
	private ImageViewer viewer;
	public Controller(ImageViewer filename){
		this.viewer = filename;
	}
	
	public void newImage(String filename){
		int lastDot = filename.lastIndexOf( '.' );
	       String suffix = filename.substring( lastDot+1 );
	       suffix = suffix.toLowerCase(); // alla tecken små bokstäver
	       if( suffix.equals("jpg") || suffix.equals("gif") || suffix.equals("png") ) {
	           viewer.showImage( filename );
	       } else {
	           JOptionPane.showMessageDialog( null, "Felaktig filtyp: " + suffix );
	       }
	}
	  public void eraseImage() {
	       viewer.noImage();
	}
}
