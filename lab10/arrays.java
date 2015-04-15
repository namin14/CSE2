import java.util.Scanner;

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
        
        System.out.println("Please enter "+arraySize+ " positive integer: ");
        //int numberInput = myScanner.nextInt();
        for(int i = 1; i<=arraySize; i++){
            int numberInput = myScanner.nextInt();
            int correctInput = check(numberInput, myScanner);
            newArray[i] = correctInput;
        }
        
        System.out.println("The array is:" + newArray);
        
    }
    
    //Method to check if input is positive integer
    public static int check(int x, Scanner myScanner){
        int y = 0;
        if(x>=0){
            y = x;
            //return x;
        }
    
        else if(x<0){
            System.out.println("Sorry the number you entered is negative");
            int numberInput = myScanner.nextInt();
            int x = check(numberInput, myScanner);
            //return x;
        }
        return y;
    }
}