package p3g;

//Klassen YearScore räknar fram skillnaden i givet svar samt korrekt svar och returnerar antal poäng i points

public class YearScore {

	public int score (String answer, String question){
		int points = 0;
		int difference = 0;
		
		difference = Integer.parseInt(question) - Integer.parseInt(answer);
			
		if (difference < 0){ 
			difference = difference * -1;
		}
		
		switch (difference) { //switch-sats som bestämmer antalet poäng för givet svar efter uträknings ovan i difference
        case 0:  points = 10;
                 break;
        case 1:  points = 8;
                 break;
        case 2:  points = 6;
                 break;
        case 3:  points = 6;
        		 break;
        case 4:  points = 3;
                 break;
        case 5:  points = 3;
                 break;
        case 6:  points = 1;
                 break;
        case 7:  points = 1;
        		 break;
        case 8:  points = 1;
        		 break;
        case 9:  points = 1;
        	 	 break;  
        case 10: points = 1;
	 	 		 break;   
        default: points = 0;
                 break;
    }
		
		return points;
	}
	

	
}
