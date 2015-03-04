//Nehla Amin
//CSE2
//March 3, 2015

//Program 3: Make Symbols
//Objective: A random number between 0 and 100 inclusiveley is generated. 
//If the number is odd, the output is the the same number of "&".
//If the number is even, the output is the same number of "*".

import java.util.Random;

public class MakeSymbols{
    
    public static void main(String args[]){
        
        //Declare Random Object
        Random number = new Random();
        int numToSym;
        numToSym = number.nextInt(100);
        
        //Show the random number generated
        System.out.println("The random number generated: " + numToSym);
        System.out.print("The output pattern: ");
        
        //do-while loops for even and odd numbers
        int counter = 0;
        
        if(numToSym % 2 == 0){
            do{
                System.out.print("*");
                counter++;
            }
            while(counter < numToSym);
        }
        
        else if(numToSym % 2 != 0){
            do{
                System.out.print("&");
                counter++;
            }
            while(counter < numToSym);
        }
        
    }//End of Main
    
}//End of CLass
