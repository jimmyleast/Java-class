/*
Module 2, assignment 2
Write a program that calculates the energy needed to heat water from an 
initial temperature to a final temperature

Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms
finalTemperature and initialTemperature are temperatures in Celsius
Q is the results in Joules

I used the videos you posted to help me learn how to take the 
inputs from the users and use the scanner 

*/

import java.util.*;
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double waterMass;
     double finalTemperature;
     double initialTemperature;
     
     
     Scanner input = new Scanner(System.in);
     
            //take the water from the user
             System.out.println("Enter the amount of water in kilograms");
             waterMass  = input.nextDouble();
             
             //take the temp from the user
             System.out.println("Enter current temp in Celsius");
             initialTemperature = input.nextDouble();
             
             //take the temp from the user
             System.out.println("Enter Final temp in Celsius");
             finalTemperature = input.nextDouble();
             
             //print the results
          double Q = waterMass*(finalTemperature-initialTemperature)*4184;
          
          System.out.println("\n The Energy needed is: "+Q);
             
    }
    
    
}
