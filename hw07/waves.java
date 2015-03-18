//Nehla Amin
//CSE2
//March 17, 2015

//Program 7: Number Waves
//Objective: Create while, for, and do-while loops for the programs that gives the same output from a given number

import java.util.Scanner;

public class waves{
    
    public static void main(String args[]){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //must be 1-30 inclusive
        
        //Prompt Input
        System.out.println("Input a positive integer between 1 and 30 (inclusive) for a number wave");
        
        int trialRun1 = 1;
        
        while(trialRun1 > 0){
            
        if(myScanner.hasNextInt()){
            int limit = myScanner.nextInt(); 
            int trialRun2 = 1;

        while(trialRun2 >0){
            
        if(1 <= limit && limit <= 30){
    
        //While loop
        System.out.println("");
        System.out.println("While loop");
        int i = 1;
        
        while(i<= limit){
        
            if(i%2 == 0){
                String temp = "";
                int j = 1;
                while(j<=i){
                    temp = i + temp + " ";
                    System.out.println(temp);
                    j++;
                }
                
            }
            
            else if(i%2 != 0){
                int j = i;
                while(j<=i && j>0){
                    String temp = "";
                    int k = 0;
                    while(k<j){
                    temp = i + temp +" ";
                    //System.out.println(temp);
                    k++;
                    }
                    System.out.println(temp);
                    j--;
                  }
            }
            i++;
        }//End of While loop
        
        //For loop
        System.out.println("");
        System.out.println("For Loop");
        //Declare For-loop variables
        int j, k;
        
        for(i=0; i<=limit; i++){
            
            if(i%2 == 0){
                String temp = "";
                
                for(j=1; j<=i; j++){
                    temp = i + temp + " ";
                    System.out.println(temp);
                }
                
            }
            
            else if(i%2 != 0){
                for(j=i; j>0; j--){
                    String temp = "";
                    
                    for(k=0; k<j; k++){
                    temp = i + temp +" ";
                    }
                    System.out.println(temp);
                  }
            }
            
        }//End of For loop
        
        System.out.println("");
        System.out.println("Do While Loop");
        
        //Do-while loop
        int q = 1;
        do{
            if(q%2 == 0){
                String temp = "";
                int r = 0;
                do{
                    temp = q + temp + " ";
                    System.out.println(temp);
                    r++;
                }while(r<q);
                
            }
            
            else if(q % 2 != 0){
                int r = q;
                do{
                    String temp = "";
                    int kl = 0;
                    
                    do{
                    temp = q + temp +" ";
                    kl++;
                    }while(kl<r);
                    
                    System.out.println(temp);
                    r--;
                  }while(r<=q && r>0);
            }
            q++;
        }while(q<= limit);
        
        System.out.println("Input a positive integer between 1 and 30 (inclusive) for a number wave");
        break;
        }
        
        else{
            int badNumberInput = limit;//myScanner.nextInt();
            System.out.println("You must enter an integer between 1 and 30 inclusive");
            trialRun2++;
            break;
        }

        }//End of trialRun2
        
        }
        
        else{
            String badInput = myScanner.next();
            System.out.println("You must enter an integer");
            trialRun1++;
        }
        
   
        }//End of trialRun1
        
    }//End of main
    
}//End of class