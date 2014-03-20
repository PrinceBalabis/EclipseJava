package laboration2;
/*
 * Lab2Exercise2.java
 * Skapad den 3 september 2012
 */

/**
 * Programmet skriver text i Console-fönstret.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab2Exercise2 {

    /*
     * Metoden gör 4 utskrifter i Console-fönstret.
     * Instruktionerna utförs uppifrån och ned.
     */
    public void calculation() {
        System.out.println("   366");				// A
        System.out.println("-   55");				// B
        System.out.println("------");				// C
        System.out.println("   311");				// D
    }

    /*
     * Instruktionerna i main-metoden utförs då programmet exekveras.
     * Instruktionerna utförs uppifrån och ned.
     */
    public static void main( String[] args ) {
        Lab2Exercise2 ex2 = new Lab2Exercise2();	// E
        ex2.calculation();							// F
        System.out.println("EN GÅNG TILL!"); 		// G
        ex2.calculation(); 							// H
    }
}
// Svar 2b: E-F-A-B-C-D
// Svar 2c: E-F-A-B-C-D-G-H-A-B-C-D
