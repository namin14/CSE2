import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    
    public static void main(String args[]){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Array size
        System.out.println("Please enter an integer for the size of the array: ");
        int arraySize = myScanner.nextInt();
        
        //Construct Array
        int[] newArray;
        newArray = new int[arraySize];
        
        System.out.println("Please enter "+arraySize+ " positive integers: ");
        for(int i = 0; i<newArray.length; i++){
            
            if(myScanner.hasNextInt()){
                int numberInput = myScanner.nextInt();
                int correctInput = check(numberInput, myScanner);
                newArray[i] = correctInput;
            }
            else{
                double badInput = myScanner.nextDouble();
                System.out.println("Please enter an integer instead of a double");
                i--;
            }
        }
        
        System.out.println("The array is:" + Arrays.toString(newArray));
        
    }
    
    //Method to check if input is positive integer
    public static int check(int x, Scanner myScanner){
        int y = 0;
        if(x>=0){
            y = x;
        }
    
        else if(x<0){
            int badInput = x;//myScanner.nextInt();
            System.out.println("Sorry the number you entered is negative");
            int numberInput = myScanner.nextInt();
            y = check(numberInput, myScanner);
        }
        
        return y;
    }
    
}