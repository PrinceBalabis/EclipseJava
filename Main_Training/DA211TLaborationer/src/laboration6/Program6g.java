﻿package laboration6;
import javax.swing.*;
import java.util.Random;

public class Program6g {
    public void calculate() {
        String name;
        int nbr1,nbr2;
        Random rand = new Random();

        name = JOptionPane.showInputDialog( "Ange ditt namn" );
        nbr1 = rand.nextInt(10) + 1; nbr1=7;  // nbr1 = 1-10
        nbr2 = Integer.parseInt( JOptionPane.showInputDialog( "Ange ett tal" ) );
        
        System.out.println();
        System.out.println(name+", så här blir det: ");
        System.out.println("Addition:                 "+nbr1+"+"+nbr2+"="+(nbr1+nbr2));
        System.out.println("Subtraktion:              "+nbr1+"-"+nbr2+"="+(nbr1-nbr2));
        System.out.println("Multiplikation:           "+nbr1+"*"+nbr2+"="+nbr1*nbr2);
        System.out.println("Division:                 " + nbr1 + "/" + nbr2 + "=" +(double) nbr1 / nbr2);
        System.out.println("Heltalsdivision:          " + nbr1 + "/" + nbr2 + "=" + nbr1 / nbr2);
        System.out.println("Rest vid heltalsdivision: " + nbr1 + "%" + nbr2 + "=" + nbr1 % nbr2);        
    }

    public static void main(String[] args) {
        Program6g prog = new Program6g();
        prog.calculate();
    }
}
