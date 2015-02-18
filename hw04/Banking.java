//Nehla Amin
//CSE 002
//February 17, 2014

//HW 04 Program #2 Banking
//Objective: Determine the balance in a bank account after a withdrawal or deposit
import java.util.Random;
import java.util.Scanner;

public class Banking{
    
    public static void main(String[] args){
        
        //Declare Random Object
        Random money = new Random();
        int currentBalance;
        currentBalance = 1000 + money.nextInt(5000);
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Prompt Question
        System.out.printf("Please type V if you would like to view your current balance \n" + 
                          "Please type D if you would like to make a deposit \n" +
                          "Please type W if you would like to make a withdrawal \n" + 
                          "Input: ");
        
        String answer;
        String V;
        String D;
        String W;
        answer = myScanner.next();
        
        //Switch statements for each input
        switch(answer){
        
        //Output for "View" input
        case "V":
        System.out.println("Your current balance is $" + currentBalance);
        break;
        
        //Output for "Deposit" input
        case "D":
        System.out.printf("How much money would you like to deposit? ");
        double moneyIn = myScanner.nextDouble();
        
        if(moneyIn > 0){
            double newBalance1 = currentBalance + moneyIn;
            System.out.println("Your previous balance was $" + currentBalance + " From your deposit, your current balance is: $" + newBalance1);
            
        }
            
            else{
            System.out.println("You need to stop");
            return;
                }
        break;
        
        //Output for "Withdraw" input
        case "W":
        System.out.printf("How much money would you like to withdraw? ");
        double moneyOut = myScanner.nextDouble();
       
        if(moneyOut > 0){
            double newBalance2 = currentBalance - moneyOut;
            System.out.println("Your previous balance was $" + currentBalance + " From your deposit, your current balance is: $" + newBalance2);
            
        }
        
            else{
            System.out.println("You need to stop");
            return;
                }
        
    
        break;
        
        //Default for wrong input
        default: 
        System.out.println("You did not type a proper transaction command.");
        
        }//End Switch
        
    }//End main method
    
}//End Class