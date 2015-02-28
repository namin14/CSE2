//Nehla Amin
//CSE2
//February 27, 2015

//Lab 06
//Objective: Use several loop methods (for, while, and do while), to generate smiley faces :)

import java.util.Random;

public class SmileGenerator{
    
    public static void main(String[] args){
        
        //Declare object for Random
        Random generator = new Random();
        int smiles = 1 + generator.nextInt(100);
        
        //for loop
        for(int counter=0; counter <5; counter++){
            System.out.printf(":)");
        }
        
        System.out.println(" ");
        
        //while loop
        int counter = 0;
        while(counter < 5){
            System.out.printf(":)");
           counter++;
        }
        
        System.out.println(" ");
        
        //do while loop
        int counter2=0;
        do{
            System.out.printf(":)");
            counter2++;
        }
        while(counter2<5);
        System.out.println(" ");
        
        //Randomly Generated smiles
        int happy = 0;
        while(happy<smiles){
            System.out.printf(":)");
            happy++;
        }
        System.out.println("The random number is: "+smiles);
        System.out.println(" ");
        
        //30 :)'s per line depending on the random number of smiles generated
        for(int i=1; i<=smiles; i++){
            if(i%30==0){
                System.out.printf(":)");
                System.out.println();
            }
            else{
                System.out.printf(":)");
            }
        }
        System.out.println(" \n");
        
        //For every new line generated, a new :) is generated must use 1 loop
        for(int counterQ=1; counterQ<=5; counterQ++){
            
            if(counterQ>4){
                System.out.println(":):):):):)");
            }
            else if(counterQ>3){
                System.out.println(":):):):)");
            }
            else if(counterQ>2){
                System.out.println(":):):)");
            }
            else if(counterQ>1){
                System.out.println(":):)");
            }
            else if(counterQ>0){
                System.out.println(":)");
            }
            
        }
       
       
    }//End of main
    
}//End of class