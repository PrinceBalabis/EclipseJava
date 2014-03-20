package p3g;

/**
 * Klassen är Controller-klass i programmet DemoQuizViewer
 * @author Rolf
 *
 */
public class Demo1Controller {
	private QuizViewer viewer;
	private Demo1Input input;
	private int nbr = 0;
	
	public Demo1Controller(QuizViewer viewer, Demo1Input input) {
		this.viewer = viewer;
		this.input = input;
		input.setDemoController( this );
	}
	
	public void newClick() {
		nbr++;
		if(nbr==1) {
			Question question = new Question("Exempel","Själva frågan\npå två rader","Svar");
		    viewer.setMessage("Nu visas en fråga\npå två rader");
		    viewer.setQuestion(question);
		}
		else if(nbr==2) {
			viewer.setMessage("Nu tas frågan bort.");
			viewer.clearQuestion();
		}
		else if(nbr==3) {
			viewer.setMessage("Alternativ text i Question-ytan");
			viewer.setQuestion( new Question(" ","Nu visas alternativ text","")); // krävs " " som första argument
		}
		else if(nbr==4) {
			viewer.clearMessage();
			viewer.setQuestion( new Question(" ","Nu tömdes meddelande-ytan",""));
		}
	}
}
