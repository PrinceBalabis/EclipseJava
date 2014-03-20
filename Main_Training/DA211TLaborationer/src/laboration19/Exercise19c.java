package laboration19;

public class Exercise19c {
	
    public double sum( double[] array ) {
    	double sum = 0;
    	for(double i : array){
    		sum += i;
    	}
    	return sum;
    }
    
   public int count8( double[] array ) {
	   int count = 0;
	   for(double i : array){
		   if(i > 8){
			   count++;
		   }
	   }
	   return count;
   }
    
    public double sumNegative( double[] array ) {
    	double sumNegative = 0;
    	for(double i: array){
    		if(i < 0){
    			sumNegative+= i;
    		}
    	}
    	return sumNegative;
	}    
    
    public void action() {
    	double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
    //	double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 }; 
    	double sum;
    	System.out.println( "Talens summa är " + sum(numbers) ); 
    	System.out.println( "Antal tal större än 8: " + count8(numbers) ); 
    	sum = sumNegative(numbers);
    	System.out.println( "Summan av de negativa talen är: " + sum );
    }
    
    public static void main( String[] args ) {
        Exercise19c e19c = new Exercise19c();
        e19c.action();
    } 
}