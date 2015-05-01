//Nehla Amin
//CSE 002
//February 13, 2015

//Lab 04 - Cookie Distribution

import java.util.Scanner;

public class Cookies{
    
    public static void main(String[] args){
     
    //Declare Scanner
    Scanner myScanner;
    myScanner = new Scanner(System.in);   
     
    //Number of people
    System.out.printf("Enter the number of people: ");
    int people;
    
    //If the number of people is an integer and greater than 0 
        if(myScanner.hasNextInt())
            people = myScanner.nextInt();
            
            else{
                System.out.println("You did not enter an integer.");
                return;
                }
        
        if (people > 0)
            people = people;
            
            else{
                System.out.println("You did not enter an integer greater than 0.");
                return;
                }
    
    //Number of cookies purchased
    System.out.printf("Enter the number of cookies to be purchased: ");
    int cookies;
    
    //If the number of cookies is an integer and greater than zero
        if(myScanner.hasNextInt())
            cookies = myScanner.nextInt();
            
            else{
                System.out.println("You did not enter an integer.");
                return;
                }
            
        if(cookies > 0)
            cookies = cookies;
            
            else{
                System.out.println("You did not enter an integer greater than 0.");
                return;
                }
     
    //Number of cookies each person gets
    System.out.printf("How many cookies do you want each person to get?: ");
    int share;
    
    //If the shared cookies is an integer and greater than zero
        if(myScanner.hasNextInt())
            share = myScanner.nextInt();
            
            else{
                System.out.println("You did not enter an integer.");
                return;
            }
    
        if(share >= 0 )
            share = share;
            
            else{
                System.out.println("You did not enter an integer greater than 0.");
                return;
            }
        
    //How cookies are divided
    //people * share = x
    //cookies/x
    //if statements
    int remainder = 0;
    int x = people * share;
    remainder = (cookies / x);
    
        //if (share == 0)
            //System.out.println("You have enough cookies for each person and the amount will divide evenly");
            
        if(remainder == 0)
            System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            
        //else if(share > 0 && remainder - share == 0)
            //System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            
        else if(remainder < people){
            System.out.println("You have enough cookies for each person but the amount will not divide evenly.");
        }    
        else{ 
            int needed;
            needed = (people * share) - cookies;
            System.out.println("You do not have enough cookies. You will need to buy " + needed + " more.");
            return;
            }
           

    }   //End of Main
    
    
}   //End of Scanner