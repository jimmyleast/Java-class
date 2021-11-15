/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class fractionsProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //declaring my variables
        float fResult = 0;
        float lResult =0;
        String fraction;
        float total;
        int startingDenominator = 3;
        int endingDenominator = 99;
        int numerator = 1;


        //explaining to the user which part we will show in this output
        System.out.println("\n Showing the fractions in Ascending order with their results\n ");

        while (startingDenominator <= 99) {
            //build all outputs for the print line to display them
            fResult = (numerator/ (float) startingDenominator);
            total = (lResult += fResult );

            //building the fraction
            fraction = (numerator + "/" + startingDenominator);

            //print out the results to the user
            System.out.println(fraction + "   Result:" + fResult +"   Running total:" + total );
            startingDenominator++;
        }

        //explaining the loop finished
        System.out.println("\n  Ascending loop finished");

        //explaining to the user which part we will show in this output
        System.out.println("\n Showing the fractions in Descending order with their results \n");
        while (endingDenominator >= 3) {
            //build all outputs for the print line to display them
            fResult = (numerator/ (float) endingDenominator);
            total = (lResult += fResult );

            //building the fraction
            fraction = (numerator + "/" + endingDenominator);
            System.out.println(fraction + "   Result:" + fResult +"   Running total:" + total);
            endingDenominator--;
        }
        //explaining the loop finished
        System.out.println("\n Descending loop finished"); 
        
    }
    
}
