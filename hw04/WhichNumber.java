//Nehla Amin
//CSE 002
//February 17, 2015

//HW 04 Program #1 Which Number
//Objective: Given a series of yes or no questions, the program will guess the number you thought of between 1 and 10

import java.util.Scanner;

public class WhichNumber{
    
    public static void main(String[] args){
        
    //Declare Scanner
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    
    //Prompt Question
    System.out.println("Think of a number between 1 and 10 inclusive. Enter Y/y for yes and N/n for no for the following questions.");
    
    //Defining Variables
    String answer;
    boolean tof = true;
    
    System.out.printf("Is your number even? ");
    answer = myScanner.next();
    
    //Series of nested if - else conditional statements attempting to guess a number
    //First Split: Is the number even? Yes version
    if (answer.equals("y") || answer.equals("Y")){
        tof = true;
        System.out.printf("Is it divisible by 3? ");
        answer = myScanner.next();
        
        if(answer.equals("y") || answer.equals("Y")) {
            System.out.printf("Is your number 6? ");
            answer = myScanner.next();
            
            if(answer.equals("y") || answer.equals("Y")) {
                System.out.println("Yay!");
                return;
            }
            
            else if(answer.equals("n") || answer.equals("N")){
                System.out.println("Liar");
                return;
            }
            
            else{
                System.out.println("Sorry this is not a valid input");
                return;
            }
            
        }//End of if statement 35
        
        else if (answer.equals("n") || answer.equals("N")){
            System.out.printf("Is the number divisible by 4? ");
            answer = myScanner.next();
            
            if(answer.equals("y") || answer.equals("Y")){
                System.out.printf("Is the number divided by 4 greater than 1? ");
                answer = myScanner.next();
                    
                    if(answer.equals("y") || answer.equals("Y")){
                        System.out.printf("Is your number 8? ");
                        answer = myScanner.next();
                        
                        if(answer.equals("y") || answer.equals("Y")) {
                            System.out.println("Yay!");
                            return;
                        }
            
                        else if(answer.equals("n") || answer.equals("N")){
                            System.out.println("Liar");
                            return;
                        }
            
                        else{
                            System.out.println("Sorry this is not a valid input");
                            return;
                        }
                    }//End of if statement 64
                    
                    else if (answer.equals("n") || answer.equals("N")){
                        System.out.printf("Is your number 4? ");
                        answer = myScanner.next();
                        
                        if(answer.equals("y") || answer.equals("Y")) {
                            System.out.println("Yay!");
                            return;
                        }
            
                        else if(answer.equals("n") || answer.equals("N")){
                            System.out.println("Liar");
                            return;
                        }
            
                        else{
                            System.out.println("Sorry this is not a valid input");
                            return;
                        }
                    }//End of else statement 84
                    
                    else{
                        System.out.println("Sorry this is not a valid input");
                    }//End of else statement 104
                    
            }//End of if statement 60
            
            else if (answer.equals("n") || answer.equals("N")){
                System.out.printf("Is it divisible by 5? ");
                answer = myScanner.next();
                
                if(answer.equals("y") || answer.equals("Y")){
                    System.out.printf("Is your number 10? ");
                    answer = myScanner.next();
                    
                    if(answer.equals("y") || answer.equals("Y")) {
                        System.out.println("Yay!");
                        return;
                    }
            
                    else if(answer.equals("n") || answer.equals("N")){
                        System.out.println("Liar");
                        return;
                    }
            
                    else{
                        System.out.println("Sorry this is not a valid input");
                        return;
                    }
                }
                
                else if (answer.equals("n") || answer.equals("N")){
                    System.out.printf("Is your number 2? ");
                    answer = myScanner.next();
                    
                    if(answer.equals("y") || answer.equals("Y")) {
                        System.out.println("Yay!");
                        return;
                    }
            
                    else if(answer.equals("n") || answer.equals("N")){
                        System.out.println("Liar");
                        return;
                    }
            
                    else{
                        System.out.println("Sorry this is not a valid input");
                        return;
                    }
                }
                
                else{
                    System.out.println("Sorry this is not a valid input");
                }
                
            }//End of else statement 64
            
            else{
                System.out.println("Sorry this is not a valid input");
            }//End of else statement 84
                
        }//End of else statement 56
        
        else{
            System.out.println("Sorry this is not a valid input");
        }//End of else statement 90
        
    }//End of if statement 30
    
    //First Split: Is the number even? No version 
    else if(answer.equals("n")){
        System.out.printf("Is it divisible by 3? ");
        answer = myScanner.next();
        
        if(answer.equals("y") || answer.equals("Y")){
            System.out.printf("When divided by 3, is the number greater than 1? ");
            answer = myScanner.next();
            
            if(answer.equals("y") || answer.equals("Y")){
                System.out.printf("Is your number 9? ");
                answer = myScanner.next();
                
                if(answer.equals("y") || answer.equals("Y")) {
                    System.out.println("Yay!");
                    return;
                }
            
                else if(answer.equals("n") || answer.equals("N")){
                    System.out.println("Liar");
                    return;
                }
            
                else{
                    System.out.println("Sorry this is not a valid input");
                    return;
                }
            }//End of if statement 181
            
            else if (answer.equals("n") || answer.equals("N")){
                System.out.printf("Is your number 3? ");
                answer = myScanner.next();
                
                if(answer.equals("y") || answer.equals("Y")) {
                    System.out.println("Yay!");
                    return;
                }
            
                else if(answer.equals("n") || answer.equals("N")){
                    System.out.println("Liar");
                    return;
                }
            
                else{
                    System.out.println("Sorry this is not a valid input");
                    return;
                }
            }//End of else statement 201
            
            else{
                System.out.println("Sorry this is not a valid input");
            }//End of else statement 221
            
        }//End of if statement 177
        
        else if (answer.equals("n") || answer.equals("N")){
            System.out.printf("Is it greater than 6? ");
            answer = myScanner.next();
            
            if(answer.equals("y") || answer.equals("Y")){
                System.out.printf("Is your number 7? ");
                answer = myScanner.next();
                
                if(answer.equals("y") || answer.equals("Y")) {
                    System.out.println("Yay!");
                    return;
                }
            
                else if(answer.equals("n") || answer.equals("N")){
                    System.out.println("Liar");
                    return;
                }
            
                else{
                    System.out.println("Sorry this is not a valid input");
                    return;
                }
            }//End of if statement 231
            
            else if (answer.equals("n") || answer.equals("N")){
                System.out.printf("Is it less than 3? ");
                answer = myScanner.next();
                
                if(answer.equals("y") || answer.equals("Y")){
                    System.out.printf("Is your number 1?");
                    answer = myScanner.next();
                    
                    if(answer.equals("y") || answer.equals("Y")) {
                        System.out.println("Yay!");
                        return;
                    }
            
                    else if(answer.equals("n") || answer.equals("N")){
                        System.out.println("Liar");
                        return;
                    }
            
                    else{
                        System.out.println("Sorry this is not a valid input");
                        return;
                    }
                }//End of if statement 255
                
                else if (answer.equals("n") || answer.equals("N")){
                    System.out.printf("Is your number 5? ");
                    answer = myScanner.next();
                    
                    if(answer.equals("y") || answer.equals("Y")) {
                        System.out.println("Yay!");
                        return;
                    }
            
                    else if(answer.equals("n") || answer.equals("N")){
                        System.out.println("Liar");
                        return;
                    }
            
                    else{
                        System.out.println("Sorry this is not a valid input");
                        return;
                    }
                }//End of else statement 275
                
                else{
                    System.out.println("Sorry this is not a valid input");
                }//End of else statement 295
                
            }//End of else statement 251
            
            else{
                System.out.println("Sorry this is not a valid input");
            }//End of else statement 301
            
        }//End of else statement 227
        
        else{
            System.out.println("Sorry this is not a valid input");
        }//End of else statement 307
        
    }//End of else statement 173
        
   else{
       System.out.println("Sorry this is not a valid input");
    }//End of else statement 313
    
    }//End of Main Method
    
}//End of Class