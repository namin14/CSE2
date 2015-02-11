//Nehla Amin
//CSE 002
//Section 110
//February 10, 2014

//Program 3: Four Digits
//Read the first 4 digits after the decimal point of a number from student input

import java.util.Scanner;

public class FourDigits{
    
    public static void main(String[] args){

    //Declare Scanner and ask for input
    Scanner scanNumber;
    scanNumber = new Scanner(System.in);
    
    System.out.println("Enter a number and I will display the last four digits to the right of the decimal point");
    double myNumber = scanNumber.nextDouble();
    
    //Declaring Variables
    int digit1, digit2, digit3, digit4;
    
    //Reading the First Digit
    digit1 = (int)(myNumber*10)%10;
    
    //Reading the Second Digit
    digit2 = (int)(myNumber*100)%10;
    
    //Reading the Third Digit
    digit3 = (int)(myNumber*1000)%10;
    
    //Reading the Fourth Digit
    digit4 = (int)(myNumber*10000)%10; // clue applies here since 4.2376 output is 2375 
    
    //Print Output of all the digits
    System.out.println("The four digits are " + digit1 + digit2 + digit3 + digit4);
    }
    
}
