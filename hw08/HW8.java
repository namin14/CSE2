//Program 8: MG's Adventure World
//Objective: To create a text based adventure game using methods

import java.util.Scanner;
import java.util.Random;

public class HW8{
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        getInput(scan, "Cc");
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        getInput(scan, "AaEe", 10);
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        getInput(scan);
        
        System.out.println("Hero! Have a good day!");
    }//End of main
    
    //methods
    
    //method 1
    public static void giant(){
        
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");

    }
    
    //method 2
    public static void cave(){
        
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }

    //method 3
    public static void box(){
        
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //method 4
    public static void getInput(Scanner scan, String string){
         //if the scanner recieves c or C, the game continues to the next line
         //any other input gives the message Yeah right loser! and quits the game
         String progress1 = scan.next();
         String input;
         
         if(progress1.equals("c") || progress1.equals("C")){
             input = "good";
         }
         else{
             System.out.println("Yeah right loser!");
             System.exit(1);
             
         }
    }
    
    //method 5
    public static void getInput(Scanner scan, String string, int trial){
        
        String progress2;
        Random number = new Random();
        
        //Random objects
        int attack;
        int escape;
        
        //counters
        int counterA=0;
        int counterE=0;
        
        while(counterA < 10 || counterE != 10){
        System.out.println("What is your input? Aa for attack or Ee to escape");
        progress2 = scan.next();
        
            if( progress2.equals("A") || progress2.equals("a")){
                attack = number.nextInt(2);
                
                if(attack == 1){
                    System.out.println("You struck the giant");
                    counterA++;
                    
                    if(counterA == trial){
                        break;
                        
                    }
                }
                else if(attack == 0){
                    System.out.println("Gosh how can you miss!");
                }
            }
            
            else if(progress2.equals("E") || progress2.equals("e")){
                escape = number.nextInt(11);
                
                if(escape == 10){
                    System.out.println("You have escaped!");
                    break;
                }
                else if (escape != 10){
                    System.out.println("You did not escape.");
                }
            }
            else{
                System.out.println("You are bad at this.");
                System.exit(1);
            }
        }
        
    }
    
    //method 6
    public static void getInput(Scanner scan){
        
        int progress3;
        //progress3 = scan.nextInt();
        
        while(scan.hasNextInt()){
            progress3 = scan.nextInt();
            switch(progress3){
            
                case 1:
                System.out.println("Congratulations! You have a 4.00 gpa ");
                System.exit(1);
                break;
            
                case 2:
                System.out.println("The treasure chest is empty. Better luck next time ");
                System.exit(1);
                break;
            
                case 3:
                System.out.println("The treasure chest is empty. Better luck next time ");
                System.exit(1);
                break;
            
                default:
                System.out.println("Why can't you follow directions? ");

            }
        }
    }
    
    
}//End of class
//promt while(has.nextInt()) to prompt user for next integers