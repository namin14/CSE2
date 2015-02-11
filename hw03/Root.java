//Nehla Amin
//CSE 002
//Section 110
//February 10, 2015

//Program 2: Cubed Root
//Approximate the cubed root of a number and then raise the cubed root to the third power

import java.util.Scanner;

public class Root{
    
    public static void main(String[] args){
        
        //Declare Scanner
        Scanner cubeScan;
        cubeScan = new Scanner(System.in);
        
        //Enter a number
        System.out.println("Enter a positive double and I will print out its cubed root: ");
        double myNumber = cubeScan.nextDouble();
        
        //Guess the cubed root in 4 trials
        double guess = myNumber/3;
        
        double guess1 = (2*guess *guess *guess  + myNumber) / (3 * guess  * guess );
        double guess2 = (2*guess1*guess1*guess1 + myNumber) / (3 * guess1 * guess1);
        double guess3 = (2*guess2*guess2*guess2 + myNumber) / (3 * guess2 * guess2);
        double guess4 = (2*guess3*guess3*guess3 + myNumber) / (3 * guess3 * guess3);
        double cubeRoot = (2*guess4*guess4*guess4 + myNumber) / (3 * guess4 * guess4);
        
        //Estimate the cubed root raised to the third power
        double cubePower = Math.pow(cubeRoot,3);
        
        //Print Output
        System.out.println("The cube root is " + cubeRoot);
        System.out.println(cubeRoot + " * " + cubeRoot + " * " + cubeRoot + " = " + cubePower);
        
    }
    
}