package laboration19;

public class Exercise19b {
	
    public void greaterThan8( double[] array ) {
        for(double i: array){
        	if(i > 8){
        		System.out.print(i + "  ");
        	}
        }
        System.out.println();
    }
    
    public void negativeNumbers( double[] array ) {
        for(double i: array){
        	if(i < 0){
        		System.out.print(i + "  ");
        	}
        }
        System.out.println();
    }
    
    public void reverse( double[] array ) {
    	System.out.print("Talaen baklänges: ");
    	for(int i = (array.length -1); i >= 0; i--){
    		System.out.print(array[i] + "  ");
    	}
        System.out.println();
    }
  
    public void everyThirdReverse( double[] array ) {
    	System.out.print("Vart 3:e tal baklänges: ");
    	int icount = 3;
    	for(int i = (array.length-1); i >= 0; i--){
    		if(icount == 3){
    		System.out.print(array[i] + "  ");
    		icount = 0;
    		}
    		icount++;
    	}
    }
    
    public void action() {
    	//double[] numbers={ 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
    	double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 };
    	greaterThan8(numbers);
    	negativeNumbers(numbers);
    	reverse(numbers);
    	everyThirdReverse(numbers);
}
    
    public static void main( String[] args ) {
    	Exercise19b e19b = new Exercise19b();
    	e19b.action();
    } 
}