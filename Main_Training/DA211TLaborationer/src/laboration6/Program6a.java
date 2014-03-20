/*
 * StringProgram.java
 * 13/9-2012
 */
package laboration6;
import javax.swing.JOptionPane;

/**
 * Programmet ger exempel på några metoder i klassen String
 * @author Rolf Axelsson
 */
public class Program6a {
    public void nameInfo1() {
        String name, upperCase, lowerCase, res="";
        int count;
        char firstLetter;

        name = JOptionPane.showInputDialog("Mata in ditt förnamn");
        count = name.length();  // length() => antal tecken i String-objektet
        upperCase = name.toUpperCase();  // toUpperCase => nytt String-objekt
        lowerCase = name.toLowerCase();  // toLowerCase => nytt String-objekt
        firstLetter = name.charAt(0);  // charAt(index) => returnerar tecken i visst index

        res += "Du heter " + name + "\n" +
        		"Ditt namn innehåller: " + count + "\n" +
        		"Ditt namn med stora bokstäver: " + upperCase + "\n" + 
        		"Ditt namn med små bokstäver: " + lowerCase + "\n" + 
        		"Första bokstäven i ditt namn: " + firstLetter;
        JOptionPane.showMessageDialog(null, res);
    }

    public static void main(String[] args) {
        Program6a sp = new Program6a();
        sp.nameInfo1();
    }
}
