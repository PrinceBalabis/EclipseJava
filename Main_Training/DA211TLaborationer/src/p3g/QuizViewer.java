package p3g;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ett objekt av typen QuizViewer har två ytor att visa information i. En avsedd att visa 
 * en fråga i och en att visa meddelande i.
 * Klassen QuizViewer är en JPanel och är därför avsedd att användas i grafiska program.
 * @author Rolf
 *
 */
public class QuizViewer extends JPanel {
    private JLabel lblTitle = new JLabel(" ");
    private JTextArea taQuestion = new JTextArea();
    private JTextArea taMessage = new JTextArea();
    
    // QuizViewer-objekt skapas.
    public QuizViewer() {
    	
        setLayout(new BorderLayout());
        taQuestion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblTitle.setBackground(Color.DARK_GRAY);
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setOpaque(true);
        taQuestion.setPreferredSize(new Dimension(400,100));
        taMessage.setPreferredSize(new Dimension(400,100));
        add(lblTitle,BorderLayout.NORTH);
        add(taQuestion,BorderLayout.CENTER);
        add(taMessage,BorderLayout.SOUTH);
    }
    
    /**
     * Ytan att visa frågor i rensas från text
     */
    public void clearQuestion() {
        lblTitle.setText("");
        taQuestion.setText("");
    }
    
    /**
     * Ytan att visa information i rensas från text
     */
    public void clearMessage() {
        taMessage.setText("");
    }
    
    /**
     * En fråga och frågans titel visas
     */
    public void setQuestion(Question question) {
        lblTitle.setText(question.getTitle());
        taQuestion.setText(question.getQuestion());
    }
    
    /**
     * Ett meddelenade i textform visas.
     */
   public void setMessage(String message) {
        taMessage.setText(message);
    }
}

