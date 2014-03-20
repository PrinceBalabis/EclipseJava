package p3g;
import javax.swing.*;

/**
 * Startklass för programmet Quiz
 * @author Rolf
 *
 */
public class Quiz {
    public static void newFrame( JPanel panel, String windowTitle, int x, int y ) {
        JFrame frame = new JFrame( windowTitle );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLocation( x, y );
        frame.add( panel );
        frame.pack();
        frame.setVisible( true );
        frame.setResizable( true );
    }
    
    public static void main(String[] args) {
        QuizViewer viewer = new QuizViewer();
        QuizInput input = new QuizInput();
        YearQuestions questions = new YearQuestions();
        YearScore score = new YearScore();
        Controller controller = new Controller( input, viewer, questions, score );
        Quiz.newFrame(viewer, "Quiz Wiewer", 10, 10 );
        Quiz.newFrame(input, "Quiz Input", 500, 10 );
    }
}
