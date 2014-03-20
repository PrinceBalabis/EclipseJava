package p3g;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Klassen används i programmet DemoQuestion. Klassen är en panel. 
 * Panelen innehåller en JButton-komponent. Vid klick på knappen meddelas 
 * Demo2Controller-objektet att användaren klickat på knappen. 
 * @author Rolf
 *
 */
public class Demo2Input extends JPanel implements ActionListener {
	private Demo2Controller controller;
	private JButton btnAction = new JButton("Tryck för händelse");
	
	public Demo2Input() {
		setPreferredSize( new Dimension(200,50) );
		setLayout( new BorderLayout() );
		btnAction.addActionListener( this );
		add(btnAction,BorderLayout.CENTER);
		
	}
	
	public void setDemoController( Demo2Controller controller ) {
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
		controller.newClick();
	}
}



