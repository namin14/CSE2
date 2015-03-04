//Nehla Amin
//CSE2
//March 3, 2015

//Program 1: Get Integers
//Objective: Get 5 positive integers from the user and compute their sum

import java.util.Scanner;

public class GetIntegers{
    
    public static void main(String args[]){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Prompt input
        System.out.println("Please enter 5 non-negative integers:");
        
        //Infinite input loops compute sum if all inputs are integers and positive
        //Declare Variables
        int counter = 0;
        final int finalCount = 5;
        int mySum = 0;
        
        while(counter!=finalCount){
            
            if(myScanner.hasNextInt()){
                int myNum = myScanner.nextInt();
                
                if(myNum >= 0){
                    mySum += myNum;
                    counter++;
                }
                else{
                    System.out.println("You must enter a positive integer");
                }
            }
            else{
                String badInput = myScanner.next();
                System.out.println("You must enter an integer");
                
            }
        }
        
        System.out.println("The sum of all integers are: " + mySum);
        
    }//End of Main
    
}//End of Class