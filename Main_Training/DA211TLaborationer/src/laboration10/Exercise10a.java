package laboration10;

/**
 * Träna for-loop 
 * @author Rolf Axelsson
 */
public class Exercise10a {
    public void exercise10a0() {
        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( 'A' + " ");
        }
    }
    
        public void exercise10a1() {
            for( int i = 0 ; i < 10 ; i++ ) {
                System.out.print( 'h' + " ");
            }
        }
        
        public void exercise10a2() {
            for( int i = 0 ; i < 10 ; i++ ) {
                System.out.print(i + " ");
            }
        }
        
        public void exercise10a3() {
            for( int i = 1 ; i < 11 ; i++ ) {
                System.out.print(i + " ");
            }
        }
        
        public void exercise10a4() {
            for( int i = 0 ; i < 10 ; i++ ) {
                System.out.print((9-i) + " ");
            }
        }
        
        public void exercise10a5() {
            for( int i = 0 ; i < 9 ; i++ ) {
                System.out.print(i + " ");
                i++;
            }
        }
        
        public void exercise10a6() {
            for( int i = 30 ; i > 10 ; i-=5 ) {
                System.out.print(i + " ");
            }
        }
        
    public static void main(String[] args) {
        Exercise10a e10a = new Exercise10a();
        e10a.exercise10a0();
        System.out.println();
        e10a.exercise10a1();
        System.out.println();
        e10a.exercise10a2();
        System.out.println();
        e10a.exercise10a3();
        System.out.println();
        e10a.exercise10a4();
        System.out.println();
        e10a.exercise10a5();
        System.out.println();
        e10a.exercise10a6();
    }
}
