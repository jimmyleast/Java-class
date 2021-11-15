

// import the java utility
   import java.util.*;
public class Module3{
  public static void main(String[] args) {
      //create scanner and randome number generator
      Scanner scanner = new Scanner(System.in);
      Random randnum = new Random ();
      //create all the variables
      int Rock =1;
      int Paper =2;
      int Scissors =3;
      int Quit = 4;
      int userChoice = 0;
      int computerChoice = 0;
      
      // create a while loop that will run until the user wants to quit
     while (true){
         
         if (userChoice == 4){
             break;
         
         }
      // tell them about my game
      System.out.println("welcome to Jimmy's Rock, Papaer and Scissors Game: ");
      //take the input from them
      System.out.println("Please chose one of the following\n: Rock(1)\n: Paper(2)\n: Scissors(3)\n: Quit (4):");
      //create the computer user and the person playing the game
      userChoice = scanner.nextInt();
      computerChoice = randnum.nextInt(3)+1;
      
     //build out who wins and then tell who wins, ties, or loses
        if (userChoice == Rock){
            if (computerChoice == Rock){
                System.out.println("It's a Tie");
            }
            else if (computerChoice == Paper){
                System.out.println("You Lose");
            }
            else if (computerChoice == Scissors){
                System.out.println("You Win");
            }
        }
        else if (userChoice == Paper){
            if (computerChoice == Rock){
                System.out.println("You Win");
            }
            else if (computerChoice == Paper){
                System.out.println("It's a Tie");
            }
            else if (computerChoice == Scissors){
                System.out.println("You Lose");
            }
        }
        else if (userChoice == Scissors){
            if (computerChoice == Rock){
                System.out.println("You Lose");
            }
            else if (computerChoice == Paper){
                System.out.println("You Win");
            }
            else if (computerChoice == Scissors){
                System.out.println("It's a Tie");
            }
        }

  
    } 
     //tell them thank you for playing
      System.out.println("Thank you for Playing");
      
  }
}