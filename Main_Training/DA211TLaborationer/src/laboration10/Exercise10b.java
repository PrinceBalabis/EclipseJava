package laboration10;

/**
 * Träna while-loop
 * @author Rolf Axelsson
 */
public class Exercise10b {
    public void exercise10b0() {
        int i = 0;
        while( i < 10 ) {
            System.out.print( 'A' + " ");
            i++;
        }
    }
    
    public void exercise10b1() {
        int i = 0;
        while( i < 10 ) {
            System.out.print( 'h' + " ");
            i++;
        }
    }
        
        public void exercise10b2() {
            int i = 0;
            while( i < 10 ) {
                System.out.print( i + " ");
                i++;
            }
    }
        
        public void exercise10b3() {
            int i = 1;
            while( i <= 10 ) {
                System.out.print( i + " ");
                i++;
            }
    }
        
        public void exercise10b4() {
            int i = 9;
            while( i >= 0 ) {
                System.out.print( i + " ");
                i--;
            }
    }
        
        public void exercise10b5() {
            int i = 0;
            while( i <= 8 ) {
                System.out.print( i + " ");
                i+=2;
            }
    }
        
        public void exercise10b6() {
            int i = 30;
            while( i >= 10 ) {
                System.out.print( i + " ");
                i-=5;
            }
    }
   
    
    public static void main(String[] args) {
        Exercise10b e10b = new Exercise10b();
        e10b.exercise10b0();
        System.out.println();
        e10b.exercise10b1();
        System.out.println();
        e10b.exercise10b2();
        System.out.println();
        e10b.exercise10b3();
        System.out.println();
        e10b.exercise10b4();
        System.out.println();
        e10b.exercise10b5();
        System.out.println();
        e10b.exercise10b6();
    }
}
