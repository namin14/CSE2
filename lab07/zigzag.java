import java.util.Scanner;

public class zigzag{
    
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Declare Variables
        int nStars = 0;
        int q = 1;
        //int counter1 = 1;
        //int counter2 = 0;
        //int counter3 = 1;
        int copyStars = 0;
        int limit = 0;
        int k = 1;
        
        while(k > 0){
            
        //validate input
        while(q>0){
             System.out.println("Please enter an integer between 3 and 33 inclusive: ");
             
        if(myScanner.hasNextInt()){
            nStars = myScanner.nextInt();
            
            if(nStars >= 3 && nStars <= 33){
                nStars = nStars;
                copyStars = nStars;
                limit = copyStars - 1;
                break;
                //continue;
            }
            
            else{
                //int badInputInt = myScanner.nextInt();
                System.out.println("The integer must be between 3 and 33 inclusive");
                myScanner.next();
                q++;
            }
        }
        
            else{
                String badInput = myScanner.next();
                System.out.println("Enter an integer");
                myScanner.next();
                q++;
            }
        }    
        int counter1 = 1;
        int counter2 = 0;
        int counter3 = 1;
            
        //first row of stars
        while(counter1 < nStars){
            System.out.print("*");
            counter1++;
        }
        
        //diagonal pattern
        while(counter2 < limit){
            String temp = "*";
            int j = 1;
            
            while(j <= counter2){
                temp = " " + temp;
                //System.out.println(temp);
                j++;
            }
            System.out.println(temp);
            counter2++;
        }
        
        //second row of stars
        while(counter3 <= nStars){
            System.out.print("*");
            counter3++;
        }
        
        System.out.println("");
        System.out.println("Enter Y or y to go again: ");
        String answer = myScanner.next();

        if(answer.equals("Y") || answer.equals("y")){
            continue;
        }
        
        else {
            break;
        }
        
        }//end of while true k statement
        
    }//main
    
}//class