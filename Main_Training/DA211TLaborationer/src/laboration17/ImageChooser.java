package laboration17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageChooser extends JPanel{
	
	private JRadioButton rbImage1 = new JRadioButton("London");
	private JRadioButton rbImage2 = new JRadioButton("FilmLogga"); 
	private JRadioButton rbImage3 = new JRadioButton("Lugi"); 
	private JRadioButton rbImage4 = new JRadioButton("Tandem"); 
	private JRadioButton rbImage5 = new JRadioButton("Detta program"); 
	private JButton btnRemoveImage = new JButton("Ta bort bild");
	private Controller controller;
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	public ImageChooser(Controller controller){
		this.controller = controller;
		setLayout(new BorderLayout());
		
		buttonGroup.add(rbImage1);
		buttonGroup.add(rbImage2);
		buttonGroup.add(rbImage3);
		buttonGroup.add(rbImage4);
		buttonGroup.add(rbImage5);
		
		JPanel pnlRadioButtons = new JPanel( new GridLayout(5,1) );
		pnlRadioButtons.add(rbImage1);
		pnlRadioButtons.add(rbImage2);
		pnlRadioButtons.add(rbImage3);
		pnlRadioButtons.add(rbImage4);
		pnlRadioButtons.add(rbImage5);
		btnRemoveImage.setPreferredSize(new Dimension(100,20));
		add(pnlRadioButtons, BorderLayout.CENTER);
		add(btnRemoveImage, BorderLayout.SOUTH);

		addListeners();
	}
	
	public void addListeners() {
		ImageListener listener = new ImageListener(); 
		rbImage1.addActionListener( listener ); 
		rbImage2.addActionListener( listener ); 
		rbImage3.addActionListener( listener ); 
		rbImage4.addActionListener( listener ); 
		rbImage5.addActionListener( listener ); 
		btnRemoveImage.addActionListener( new EraseListener() );
		}
	private class EraseListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			controller.eraseImage();
		}
	}

	private class ImageListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				if( rbImage1.isSelected() )
					controller.newImage("src/laboration17/london06.jpg"); 
				else if( rbImage2.isSelected() )
					controller.newImage("src/laboration17/filmlogga.jpg"); 
				else if( rbImage3.isSelected() )
					controller.newImage("src/laboration17/lugi.gif"); 
				else if( rbImage4.isSelected() )
					controller.newImage("src/laboration17/tandem1.jpg"); 
				else if( rbImage5.isSelected() )
					controller.newImage("src/laboration17/program.bmp");
				}
		}
}
