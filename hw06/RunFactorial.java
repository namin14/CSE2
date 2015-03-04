//Nehla Amin
//CSE2
//March 3, 2015

//Program 2: Factorial Calculator
//Objective: Enter a number between 9 and 16 inclusively and calculate its factorial

import java.util.Scanner;

public class RunFactorial{
    
    public static void main(String args[]){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Prompt Input
        System.out.println("Please enter an integer between 9 and 16 inclusively:");
        
        //while loop
        //Declare Variables
        int counter = 1;
        int factNum = 0;
        int finalCount = 0;
        boolean boolValue = true;
        int factorialProduct = 1;
        
        //If statements confirming the conditions of the input for a number between 9 and 16 inclusively
        while(boolValue){
            
        if(myScanner.hasNextInt()){
            factNum = myScanner.nextInt();
            
            if(factNum>=9 && factNum<=16){
                finalCount = factNum;
                break;
            }
            else{
                System.out.println("You must enter an integer between 9 and 16 inclusively");
            }
        }
        
        else{
            String badInput = myScanner.next();
            System.out.println("You must enter an integer");
        }
        
        }//End of while statement
        
        while(counter <= finalCount){
            factorialProduct *= counter;
            counter++;
        }
        
        System.out.println(factNum + "!: " + factorialProduct);
        
    }//End of Main
    
}//End of Class