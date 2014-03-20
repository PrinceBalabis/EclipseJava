package laboration19;

public class Exercise19a {
      
	 public void action() {
		 // För att ändra körresultaten
		 double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 }; 
		 //     double[] numbers = {-1,2,5,8,11,14,10,6,2,-4};
		    
		 // Huvuduppgift
		 int counter = 0;
		 System.out.println("***Huvuduppgift***");
		 for (int i = 0; i < numbers.length; i++){
			 if(numbers[i] < 10){
				 System.out.print(numbers[i] + "  ");
				 counter++;
			 }
	        	
		 }
		 System.out.println(", antal = " + counter);
		 System.out.println();
	 
	  // Deluppgift 1
		 System.out.println("***Deluppgift 1***");
		 System.out.println("Antal Element: " + numbers.length);
	     System.out.println();

	  // Deluppgift 2
		 System.out.println("***Deluppgift 2***");
		 double sum = 0;
		 for(int i = 0; i < numbers.length ; i++){
			 sum+=numbers[i];
		 }
		 System.out.println("Talens summa är " + sum);
	     System.out.println();

	  // Deluppgift 3
	     System.out.println("***Deluppgift 3***");
	     counter = 0;
	     for(int i = 0; i < numbers.length; i++){
	    	 if(numbers[i] > 8){
	    	     System.out.print(numbers[i] + "  ");
	    	     counter++;
	    	 }
	     }
	     System.out.println();
	     System.out.println();
	     
	  // Deluppgift 4
	     System.out.println("***Deluppgift 4***");
	     System.out.println("Antal tal större än 8: " + counter);
	     System.out.println();
	     
	  // Deluppgift 5
	     System.out.println("***Deluppgift 5***");
	     sum = 0;
	     for(int i = 0; i < numbers.length; i++){
	    	 if(numbers[i] < 0){
	    		 System.out.print(numbers[i] + "  ");
	    		 sum+=numbers[i];
	    	 }
	     }
	     System.out.println();
	     System.out.println();
	     
	  // Deluppgift 6
	     System.out.println("***Deluppgift 6***");
	     System.out.println("Summan av de negativa talen är: " + sum);
	     System.out.println();
	     
	  // Deluppgift 7
	     System.out.println("***Deluppgift 7***");
    	 System.out.print("Talen baklänges: "); 
	     for(int i = numbers.length-1; i >= 0; i--){
	    	 System.out.print(numbers[i] + "  ");
	     }
	     System.out.println();
	     System.out.println();
	     
	  // Deluppgift 8
	     System.out.println("***Deluppgift 8***");
	     System.out.print("Vart 3:e tal baklänges: ");
	     int icount = 3;
	     for(int i = (numbers.length-1) ; i >= 0; i--){
	    	 if(icount == 3){
	    		 System.out.print(numbers[i] + "  ");
	    		 icount = 0;
	    	 }
	    	 icount++;
	     }
	     System.out.println();
	     System.out.println();
	     
	 // Deluppgift 9
	     System.out.println("***Deluppgift 9***");
	     for(double i: numbers){
	    	 System.out.print(i + "  ");
	     }
	     System.out.println();
	     System.out.println();

	// Deluppgift 10
	     System.out.println("***Deluppgift 9***");
	     int isum = 0;
	     for(double i : numbers){
	    	if(i > 8){
	    		isum++;
	    	}
	     }
	     System.out.print("Antal tal större än 8: " + isum);
	     
	 }
	 

     
	        public static void main( String[] args ) {
	            Exercise19a e19a = new Exercise19a();
	            e19a.action();
	        }
}
