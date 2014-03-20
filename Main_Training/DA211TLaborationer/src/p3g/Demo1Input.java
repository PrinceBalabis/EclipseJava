package p3g;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Klassen används i programmet DemoQuizViewer. Klassen är en panel. 
 * Panelen innehåller en JButton-komponent. Vid klick på knappen meddelas 
 * Demo1Controller-objektet att användaren klickat på knappen. 
 * @author Rolf
 *
 */
public class Demo1Input extends JPanel implements ActionListener {
	private Demo1Controller controller;
	private JButton btnAction = new JButton("Tryck för händelse");
	
	public Demo1Input() {
		setPreferredSize( new Dimension(200,50) );
		setLayout( new BorderLayout() );
		btnAction.addActionListener( this );
		add(btnAction,BorderLayout.CENTER);
	}
	
	public void setDemoController( Demo1Controller controller ) {
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
		controller.newClick();
	}
}



