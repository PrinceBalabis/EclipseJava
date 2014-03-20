package laboration2;
/*
 * Lab2Exercise1.java
 * Skapad den 3 september 2012
 */
import javax.swing.JOptionPane;

/**
 * Programmet skriver ut "Ett java-program" med hj�lp av ett dialogf�nster.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab2Exercise1 {

    /*
     * Metoden visar texten "Ett java-program" i ett dialogf�nster.
     */
    public void message() {
        // Ett dialogf�nster �ppnas med meddelandet "TJABBA BROOOO".
        JOptionPane.showMessageDialog( null, "TJABBA BROOOO" );
        // Ett dialogfönster öppnas med meddelandet "TJABBA BRO2"
        JOptionPane.showMessageDialog( null, "TJABBA BRO2" );
    }

    /*
     * Instruktionerna i main-metoden utf�rs d� programmet exekveras.
     * main-metoden har endast tv� instruktioner.
     * - den f�rsta instruktionen skapar ett objekt av typen Lab2Exercise1
     * - den andra instruktionen anropar metoden message i det nyss skapade objektet
     */
    public static void main( String[] args ) {
        Lab2Exercise1 prog = new Lab2Exercise1();
        prog.message();
    }
}
