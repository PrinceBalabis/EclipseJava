package laboration10;

/**
 * 3 metoder med samma mening
 * @author Rolf Axelsson
 */
public class Exercise10d {
    public void forloop() {
    	int min = 10, max = 25, increase = 3;
        for(int i = min ; i <= max; i += increase ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void whileloop() {
    	int min = 10, max = 25, increase = 3;
        while( min <= max ) {
            System.out.print( min + " ");
            min+=increase;
        } System.out.println();

    }

    public void doloop() {
    	int min = 10, max = 25, increase = 3;
        do {
            System.out.print( min + " ");
            min+=increase;
       } while( min <= max );
   }

    public static void main(String[] args) {
        Exercise10d e10d = new Exercise10d();
        e10d.forloop();
        e10d.whileloop();

        e10d.doloop();
    }
}
