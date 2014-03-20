package laboration17;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImageViewer extends JPanel{
	
	JLabel lblTitle = new JLabel();
	JLabel lblImage = new JLabel("INGEN BILD VALD", JLabel.CENTER);
	
	public ImageViewer(){
		setLayout( new BorderLayout());
		lblImage.setPreferredSize(new Dimension(640,480));
		add(lblTitle, BorderLayout.NORTH);
		add(lblImage, BorderLayout.CENTER);
	}
	
	public void showImage(String image){
		lblImage.setText("");
		lblImage.setIcon(new ImageIcon(image));
		lblTitle.setText(image);
	}
	
	public void noImage(){
		lblImage.setIcon(null);
		lblImage.setText("INGEN BILD VALD");
	}
	public static void main(String args[]) {
		ImageViewer viewer = new ImageViewer(); 
		viewer.showImage("/Users/Prince/Documents/EclipseWorkspace/DA211TLaborationer/src/laboration17/filmlogga.jpg"); 
		JOptionPane.showMessageDialog(null, viewer);
	}
}
