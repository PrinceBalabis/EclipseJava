package p3;

/** ****************************************************************************
 * Klassen YearScore ska innehålla metoden score vilken Controller-objektet 
 * anropar för att få reda på hur många poäng ett svar är värt.
 * @author Prince Balabis
 * ****************************************************************************/

public class YearScore {
	
	// Ritar upp behövande variabler;
	int playerAnswerInt, rightAnswerInt;
	int totalScore = 0, score;
	
	// Importerar spelarens svar och det rätta svaret i en parameter och bestämmer poängen.
	public int score(String playerAnswerStr, String rightAnswerStr){
		// Tar spelarens svar och det rätta svaret och lagrar i 
		// lokala variabler för poängberäkning
		this.playerAnswerInt = Integer.parseInt(playerAnswerStr);
		this.rightAnswerInt = Integer.parseInt(rightAnswerStr);
	
		// Gör poängberäkningen och lägger till poängen till totalpoängen.
		totalScore += scoreCalculation();
		
		// Ger totalpoängen i form av int.
		return totalScore;
	}
	
	// Gör beräkningen för poängen och lagrar resultatet i 'score'.
	private int scoreCalculation(){
		// Nollställer förra resultatet.
		score = 0;
		
		// Beräknar poängen och ger tillbaka resultatet.
		if(playerAnswerInt == rightAnswerInt){
			score += 10;
		} else if(playerAnswerInt >= (rightAnswerInt-1) && playerAnswerInt <= (rightAnswerInt+1)){
			score += 8;
		} else if(playerAnswerInt >= (rightAnswerInt-3) && playerAnswerInt <= (rightAnswerInt+3)){
			score += 6;
		} else if(playerAnswerInt >= (rightAnswerInt-5) && playerAnswerInt <= (rightAnswerInt+5)){
			score += 3;
		} else if(playerAnswerInt >= (rightAnswerInt-10) && playerAnswerInt <= (rightAnswerInt+10)){
			score += 1;
		}
		return score;
	}
	
	// Återställer poängen till noll.
	public void resetTotalScore(){
		totalScore = 0;
	}
	
	// Hämtar poängresultatet från förra svaret.
	public int getScore(){
		return score;
	}
	
}
