//Nehla Amin
//CSE 002
//Lab 03
//February 6,2015

//Program the cost of buying Big Macs

import java.util.Scanner;

public class BigMac{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        //Enter the number of Big Macs
        System.out.println("Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        
        //Enter Cost of Big Mac
        System.out.println("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        //Calculate Sales Tax
        System.out.println("Enter the percent tax as  whole number(xx): ");
        double taxRate = myScanner.nextDouble();
            taxRate /= 100; // This is an example of combining division with an assignment operator to store a new value within the variable taxRate
                            // i.e. 7/100 = 0.07 = taxRate
        
       //Declaring Variables
        double cost$;
        int dollars, dimes, pennies;
        
        //Calculations
        cost$ = nBigMacs * bigMac$ * (1+taxRate);
        dollars = (int)cost$;
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        
        //Output
        System.out.println("The Total cost of " + nBigMacs + " Big Macs at $" + bigMac$ + " per Big Mac, with a sales tax of " + 
        
        (int)(taxRate*100) + "%, is $" + dollars + '.' + dimes + pennies);
        
        
    }
    
}
