package p3;

import java.awt.*;
import javax.swing.*;

/** *****************************************************************************
 * Klassen QuizInput innehåller de komponenter som genererar händelser 
 * i systemet. Och som därmed sätter igång exekvering av en sekvens med instruktioner. 
 * Quiz Input-fönstret (QuizInput-objektet) ska meddela Controller-objektet då 
 * användaren klickar på en knapp.
 * 
 * @author Prince Balabis
 ********************************************************************************/

public class QuizInput extends JPanel{
	// Skapar behövande variabler och komponenter
	Controller controller;
	JLabel lblAnswer = new JLabel("Svar:");
	JTextArea txtInput = new JTextArea();
	JButton btnAnswer = new JButton("Svara");
	JButton btnStartGame  = new JButton("Starta spel");
	JButton btnStopGame = new JButton("Avbryt spel");
	JButton btnExit = new JButton("Avsluta");
	
	// Tar emot en controller-objekt, implementerar den i panelen
	// och lägger till komponenter
	public void setController(Controller controller) {
		// Tar emot objektet
		this.controller = controller;
		// Sätter storlek på panelen/ramen.
		setPreferredSize(new Dimension(500, 70));
		
		// Ser till att inaktivera knappar som ej behövs.
		btnStopGame.setEnabled( false );
		btnAnswer.setEnabled( false );
		txtInput.setEnabled( false );
		
		// Gör panelen finare med rätt storlek på JTextArea.
		txtInput.setPreferredSize(new Dimension(300,20));
		
		// Ger Controller-klassen en signal när en knapp trycks ner.
		btnAnswer.addActionListener(controller);
		btnStartGame.addActionListener(controller);
		btnStopGame.addActionListener(controller);
		btnExit.addActionListener(controller);
		
		// Ritar upp panelen!
		add(lblAnswer);
		add(txtInput);
		add(btnAnswer);
		add(btnStartGame);
		add(btnStopGame);
		add(btnExit);
	}
}
