package p3g;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Klassen QuizInput som är av typen JPanel och objekten i den definieras

public class QuizInput extends JPanel implements ActionListener {

	private Controller controller;
	private JLabel lblAns = new JLabel("Svar:");
	private JTextField tfAns = new JTextField();
	private JButton btnAns = new JButton("Svara");
	private JButton btnStart = new JButton("Starta spel");
	private JButton btnStop = new JButton("Avbryt spel");
	private JButton btnExit = new JButton("Avsluta");

	public QuizInput() {

		setPreferredSize(new Dimension(320, 50)); //Sätter storlek m.m.
		setLayout(new BorderLayout());

		add(upperField(), BorderLayout.NORTH); //Addar metoderna nedan i fönstret
		add(lowerButtons(), BorderLayout.CENTER);

		btnAns.setEnabled(false); //Knapparna syns ej
		btnStop.setEnabled(false);
		tfAns.setEnabled(false);

	}

	private JPanel lowerButtons() {	//Nedre panelen med tre knappar skapas och  definieras
		JPanel lowerButtons = new JPanel(new BorderLayout());

		btnStart.setPreferredSize(new Dimension(100, 20));
		btnStop.setPreferredSize(new Dimension(100, 20));
		btnExit.setPreferredSize(new Dimension(100, 20));

		lowerButtons.add(btnStart, BorderLayout.WEST);
		lowerButtons.add(btnStop, BorderLayout.CENTER);
		lowerButtons.add(btnExit, BorderLayout.EAST);

		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);

		return lowerButtons;

	}

	private JPanel upperField() { //Övre fältet med inmatningsfält m.m.
		JPanel upperField = new JPanel(new BorderLayout());

		upperField.add(lblAns, BorderLayout.WEST);
		upperField.add(tfAns, BorderLayout.CENTER);
		upperField.add(btnAns, BorderLayout.EAST);

		btnAns.addActionListener(this);

		return upperField;

	}

	public void setController(Controller controller) { //setController skapas som finns i klassen Controller

		this.controller = controller;

	}

	//Definierar actions för knappar givna tidigare och olika värden dessa får vid knapptryck
	
	public void actionPerformed(ActionEvent e) {

		int rounds = 0; // Nollar rounds som nedan räknar antalet tryck på
						// knappen svara

		if (e.getSource() == btnAns) {

			controller.answer(tfAns.getText()); //
			rounds++;
		}

		else if (e.getSource() == btnStart) {

			btnAns.setEnabled(true);
			btnStop.setEnabled(true);
			btnStart.setEnabled(false);
			tfAns.setEnabled(true); 
			controller.startGame();

		}

		else if (e.getSource() == btnStop) {

			controller.stopGame();
			btnAns.setEnabled(false);
			btnStop.setEnabled(false);
			btnStart.setEnabled(true);
			tfAns.setEnabled(false);

		}

		else if (e.getSource() == btnExit) {

			controller.exit();
		}

	}

	public void clear() { //Rensar inmatningsfältet
		tfAns.setText("");
	}

	public void reset() { //Ställer om knapparna till startläge
		btnAns.setEnabled(false);
		btnStop.setEnabled(false);
		btnStart.setEnabled(true);
		tfAns.setEnabled(false);
	}

}