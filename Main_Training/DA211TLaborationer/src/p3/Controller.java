package p3;

import java.awt.event.*;

/** *******************************************************
 * Klassen Controller styr programflödet, 
 * dvs innehåller det mesta av logiken i programmet.
 * @author Prince Balabis
 * *******************************************************/

public class Controller implements ActionListener{
	
	// Behövande variabler;
	QuizInput input;
	QuizViewer viewer;
	YearQuestions provider;
	YearScore score;
	String answer;
	Question question;
	int totalScore, questionNumber = 1;
	
	// Skapar objekt från parametrarna och lagrar i lokala variabler,
	// med andra ord ritar och bygger upp programmet.
	public Controller( QuizViewer viewer, QuizInput input, 
			YearQuestions provider, YearScore score ) {
		input.setController( this ); 
		this.viewer = viewer;
		this.input = input;
		this.provider = provider;
		this.score = score;
		
	}
	
	// Startar spelet.
	public void startGame(){
		// Slumpmässar ordningsföljden på frågorna.
		provider.randomize();
		// Rensar från föregående spel.
		viewer.setMessage("");
		questionNumber = 1;
		// Tar den nya frågan och lagrar i en lokal variabel, 
		// samt visar den för spelaren.
		question = provider.nextQuestion();
		viewer.setQuestion(question);
		// Aktiverar/inaktiverar behövande knappar.
		input.btnStopGame.setEnabled( true );
		input.btnAnswer.setEnabled( true );
		input.txtInput.setEnabled( true );
		input.btnStartGame.setEnabled( false );
	}
	
	// Stoppar spelet.
	public void stopGame(){
		// Rensar all historik som har med förra spelet att göra.
		viewer.clearQuestion();
		viewer.clearMessage();
		input.txtInput.setText("");
		score.resetTotalScore();
		// Aktiverar/inaktiverar behövande knappar.
		input.btnStopGame.setEnabled( false );
		input.btnAnswer.setEnabled( false );
		input.txtInput.setEnabled( false );
		input.btnStartGame.setEnabled( true );

		// Skriver ut lite text.
		viewer.setMessage("Spelet är avbrutet!\n\n" +
				"Tryck på 'Starta spel' för att börja ett spel.");
	}
	
	// Stänger ner programmet.
	public void exit(){
		System.exit( 0 );
	}

	// Uppdaterar poängen, uppdaterar meddelanderutan,
	// uppdaterar frågan och gör andra finjusteringar.
	// Kan köras högst 10ggr.
	public void answer(String answer){
		// En räknare för att kunna stoppa spelet efter 10e frågan.
		questionNumber++;
		// Tar spelarens svar och lagrar i en lokal variabel.
		this.answer = answer;
		// Räknar ut totala poängen och lagrar i 'totalScore'.
		totalScore = score.score(answer, question.getAnswer());
		// Skriver ut spelinformation till spelaren.
		viewer.setMessage("Ditt svar: " + answer +
			"\nKorrekt svar: " + question.getAnswer() +
			"\nDin poäng på frågan: " + score.getScore() +
			"\n\nTotal poäng: " + totalScore);
		// Tar en ny fråga och lagrar i question-variabeln, sedan visar frågan.
		question = provider.nextQuestion();
		viewer.setQuestion(question);
		
		// Efter den 10e frågan
		if(questionNumber > 10){
			viewer.setQuestionText("Sista frågan är besvarad. Din poäng blev " + totalScore);
			input.btnStopGame.setEnabled( false );
			input.btnAnswer.setEnabled( false );
			input.txtInput.setEnabled( false );
			input.btnStartGame.setEnabled( true );
		}
		// Rensar svarsfältet.
		input.txtInput.setText("");
	}
	
	// Metoden som ser till att knapparna man trycker aktiverar rätt 
	// metod i denna klassen.
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == input.btnAnswer){
			answer(input.txtInput.getText());
		} if(e.getSource() == input.btnStartGame){
			startGame();
		} if(e.getSource() == input.btnStopGame){
			stopGame();
		} if(e.getSource() == input.btnExit){
			exit();
		}
	}
	

}
	