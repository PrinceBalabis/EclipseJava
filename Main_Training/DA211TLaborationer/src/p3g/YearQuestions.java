package p3g;

import java.util.Random;
/**
 * Klassen innehåller ett antal frågor vilka användaren kan få ta del av.
 * @author Rolf
 *
 */
public class YearQuestions {
    private Question[] questions = {
            new Question("Krig","Vilket år började Andra världskriget?","1939"),
            new Question("Konst","Vilket år dog Pablo Picasso?","1973"),
            new Question("Krig","Vilket år slutade Andra världskriget?","1945"),
            new Question("Sport","Vilket år vann Sverige Davis cup?","1974"),
            new Question("Sport","Vilket år föddes Zlatan Ibrahimovic?","1981"),
            new Question("Krig","Vilket år slutade Första världskriget?","1918"),
            new Question("Krig","Vilket år började Första världskriget?","1914"),
            new Question("Musik","Vilket år spelade Beatles in sin första singel?","1962"),
            new Question("Musik","Vilket år vann Charlotte Nilsson Eurovision Song Contest?","1999"),
            new Question("Kommunikation","Vilket år öppnades Öresundsbron","2000"),
            new Question("Kommers","Vilket år öppnades köpcentrat Entre?","2009"),
            new Question("Musik","Vilket år lanserades iPod av Apple?","2001"),
            new Question("Datavetenskap","Vilket år släppte Google operativsystem Android?","2007"),
            new Question("Sport","Vilket år tog Sverige sin senaste medalj i fotbolls-VM","1994"),
            new Question("Kultur","Vilket år kom filmen 'Fucking Åmål'?","1998"),
            new Question("Utbildning","Vilket år bildades Malmö högskola?","1998"),
            new Question("Politik","Vilket år mördades Olof Palme?","1986"),
            new Question("Politik","Vilket år tillträdde Bill Clinton som presiden i USA för första gången","1993"),
            new Question("Datavetenskap","Vilket år lanserades programmeringsspråket java?","1995"),
            new Question("Datavetenskap","Vilket år uppfann Pascal den första mekaniska räknemaskinen?","1642")
    };
    private int index = -1;
    private Random random = new Random();

    /**
     * Metoden returnerar fråga som står i tur. Är alla frågor returnerade så
     * startar det om - den första frågan returneras på nytt.
     * @return frågan som står i tur
     */
	public Question nextQuestion() {
	    index++;
		if(index==questions.length)
			index=0;
		return questions[index];
	}

	/**
	 * Returnerar antalet unika frågor som man kan erhålla genom anrop till
	 * <code>nextQuestion()</code>
	 * @return
	 */
	public int nbrOfQuestions() {
		return questions.length;
	}

	/**
	 * Blandar frågorna så de returneras i ny ordning
	 */
	public void randomize() {
	    int swapPos;
	    Question message;
		for(int i=questions.length-1; i>0; i--) {
		    swapPos = random.nextInt(i+1);
	        message = questions[i];
	        questions[i] = questions[swapPos];
	        questions[swapPos] = message;
	    }
	}
}
