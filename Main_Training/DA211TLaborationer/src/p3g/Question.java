package p3g;
import java.io.Serializable;

/**
 * Klassen lagrar information om en fråga. Data som lagras är:
 * Frågans kategori eller dyligt. Metoden <code>getTitle()</code> returnerar kategorin.
 * Själva frågan. Metoden <code>getQuestion()</code> returnerar frågan.
 * Svaret på frågan. Metoden <code>getAnswer()</code> returnerar svaret.
 * @author Rolf
 *
 */
public class Question {
	private String title;
	private String question;
	private String answer;
	
	/**
	 * Ett question-objekt skapas med bifogat innehåll.
	 * @param title frågans titel / kategori eller dylikt
	 * @param question själva frågan
	 * @param answer svaret på frågan
	 */
	public Question(String title, String question, String answer) {
		this.title = title;
		this.question = question;
		this.answer = answer;
	}
	
	/**
	 * Metoden returnerar frågans titel / kategori eller dyligt
	 * @return frågans titel / kategori eller dyligt
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Metoden returnerar frågan
	 * @return frågan
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Metoden returnerar svaret på frågan
	 * @return svaret på frågan
	 */
	public String getAnswer() {
	    return answer;
	}
}
