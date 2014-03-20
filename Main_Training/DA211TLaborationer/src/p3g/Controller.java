package p3g;

/*
 * Klassen Controller
 */

public class Controller {
	
	//Deklarerar variabler som används i klassen
	
	private QuizInput input;
	private QuizViewer viewer;
	private YearQuestions provider;
	private YearScore score;
	private Question question;
	private int rounds, 
				points, 
				pointsres = 0;
	
	//Konstruktorn controller definieras
	
	public Controller (QuizInput input, QuizViewer viewer, YearQuestions provider, YearScore score){
		
		this.input = input;
		this.viewer = viewer;
		this.provider = provider;
		this.score = score;
		input.setController( this ); //setController i input (QuizInput) definieras här
		
		
	}
	
	//Metoden startGame startar spelet
	
	public void startGame(){
		
		viewer.clearQuestion(); //Kör metoden clearQuestion i viewver
		question = null;		
		rounds = 0;
		points = 0;
		question = provider.nextQuestion(); //Hämtar nästa fråga
		viewer.setQuestion( question );		//Sätter frågan
		
		
		
	}
	
	//Metoden stopGame definieras, avslutar spelet och visar meddelande samt kör clearQuestion och clear i input
	
	public void stopGame( ){
		viewer.setMessage("Spelet är avbrutet! \n\n" +
						  "Tryck på 'Starta spel' för att börja ett spel");
		viewer.clearQuestion();
		question = null;
		input.clear();
	}
	
	public void exit(){
		System.exit(0);
	}
	
	//Metoden answer definieras, räknar antalet rundor och poäng genom att hämta svar och korrekt svar och plusa ihop i point i en if-loop.
	//Visar meddelande samt hämtar frågor inom givna loop
	
	public void answer(String answer){
		
		if (rounds < 9){
			
			pointsres = score.score(answer, question.getAnswer());
			points = points + pointsres;
			
			viewer.setMessage("Ditt svar: " + answer + "\n" + 
							  "Korrekt svar: " + question.getAnswer() + "\n" +
							  "Din poäng på frågan: " + pointsres + "\n\n" +
							  "Total poäng: " + points);
			question = provider.nextQuestion();
			viewer.setQuestion(question);
			input.clear();
			counter();
		}
		
		else {
			finalRound(); //Hoppa till finalRound
		}
		
	}
	
	public void counter(){
		rounds++; //Räknar rundorna
	}
	
	//När tionde rundan gått hoppar if-loopen i answer hit och visar ett meddelande i Question-fönstret
	
	public void finalRound(){
		String res = Integer.toString(points);
		question = new Question(" ", "Sista frågan är besvarad. Din poäng blev " + res, "");
		viewer.setQuestion(question);
		question = null;
		input.clear();
		input.reset();
		rounds = 0;
		points = 0;
		
	}
		
}
