import java.util.Scanner;

public class Factorials{
    
    public static void main(String args[]){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Prompt input
        System.out.println("Enter a number");
        int input = myScanner.nextInt();
        int sum = 0;
        
        //Process
        sum = factorial(input);
        
        String message = print(input, sum);
        System.out.println(message);
        
    }//End of main
    
    //methods 
    public static int factorial(int a){
            
            int counter = 1;
            int factorialProduct = 1;
            int answer = 0;
            
            while(counter <= a){
                factorialProduct *= counter;
                answer += factorialProduct;
                counter++;
                
            }
            return answer;
            
        }
        
        public static String print(int a, int b){
            String result = "The super factorial for " + a + " is " + b;
            return result;
            
        }
    
}//End of class