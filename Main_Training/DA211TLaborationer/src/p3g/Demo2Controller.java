package p3g;

/**
 * Klassen är Controller-klass i programmet DemoQuestion
 * @author Rolf
 *
 */
public class Demo2Controller {
	private QuizViewer viewer;
	private Demo2Input input;
	private YearQuestions questions;
	private Question question;
	private int nbr = 0;
	
	public Demo2Controller(QuizViewer viewer, Demo2Input input, YearQuestions questions) {
		this.viewer = viewer;
		this.input = input;
		this.questions = questions;
		input.setDemoController( this );
	}
	
	public void newClick() {
		if( question!=null ) {
			viewer.setMessage("Rätt svar på förra frågan: " + question.getAnswer() );
		}
		question = questions.nextQuestion();
		viewer.setQuestion( question );
	}
}
