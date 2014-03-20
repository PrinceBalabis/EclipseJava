package laboration10;

/**
 * Träna do-while-loop
 * @author Rolf Axelsson
 */

public class Exercise10c {
    public void Exercise10c0() {
        int i = 0;
        do {
            System.out.print( 'A' + " ");
            i++;
        } while( i < 10 );
    }
        public void Exercise10c1() {
            int i = 0;
            do {
                System.out.print( 'h' + " ");
                i++;
            } while( i < 10 );
        } 
            public void Exercise10c2() {
                int i = 0;
                do {
                    System.out.print( i + " ");
                    i++;
                } while( i < 10 );
    }
            
            public void Exercise10c3() {
                int i = 1;
                do {
                    System.out.print( i + " ");
                    i++;
                } while( i <= 10 );
    }
            
            public void Exercise10c4() {
                int i = 9;
                do {
                    System.out.print( i + " ");
                    i--;
                } while( i >= 0 );
    }
            
            public void Exercise10c5() {
                int i = 0;
                do {
                    System.out.print( i + " ");
                    i+=2;
                } while( i <= 8 );
    }
            
            public void Exercise10c6() {
                int i = 30;
                do {
                    System.out.print( i + " ");
                    i-=5;
                } while( i >= 10 );
    }
    
    public static void main(String[] args) {
        Exercise10c e10c = new Exercise10c();
        e10c.Exercise10c0();
        System.out.println();
        e10c.Exercise10c1();
        System.out.println();
        e10c.Exercise10c2();
        System.out.println();
        e10c.Exercise10c3();
        System.out.println();
        e10c.Exercise10c4();
        System.out.println();
        e10c.Exercise10c5();
        System.out.println();
        e10c.Exercise10c6();
    }
}
