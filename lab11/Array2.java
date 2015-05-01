import java.util.Arrays;
import java.util.Scanner;

public class Array2{
    
    public static void main(String args[]){

        //Declare scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Create arrays
        int ENTRIES = 50;
        int[] array1 = new int[ENTRIES];
        int[] array2 = new int[ENTRIES];
        
        //Fill array 1 with random numbers
        for(int i = 0; i < array1.length; i++){
            int randomNum = (int) (Math.random() * 100);
            array1[i] = randomNum;
        }
        
        int max = array1[0];
        int min = array1[0];
        
        //Linear Search for maximum on Array 1
        for(int i = 0; i < array1.length; i++){
            if(array1[i]>max){
                max = array1[i];
            }
            else{
                max = max;
            }
        }
        
        //liner search for minimum on Array 1
        for(int i = 0; i < array1.length; i++){
            if(array1[i]<min){
                min = array1[i];
            }
            else{
                min = min;
            }
        }
        //print out max and min for array 1
        System.out.println("The maximum of Array 1 is: " + max);
        System.out.println("The minimum of Array 1 is: " + min);
        
        //fill array 2 with random increasing numbers
        for(int i = 0; i < array2.length; i++){
            int randomNum = (int) (Math.random() * 100);
            array2[i] = randomNum;
        }
        
        for(int q = 0; q < (array2.length - 1); q++){
        for(int j = 1; j < (array2.length - 1 - q); j++){
            
            if(array2[j-1]>array2[j]){
                int temp = array2[j];
                array2 [j-1] = array2 [j];
                array2 [j] = temp;
            }
        }
        }
        //print out max and min for array 2
        System.out.println("The maximum for Array 2 is: " + array2[49]);
        System.out.println("The minimum for Array 2 is: " + array2[0]);
        //System.out.println(Arrays.toString(array2));
        
        System.out.println("Enter an Integer: ");
        
        //validate key input
        int key = -1;
        int k = 1;
        
        while(k > 0){
            if(myScanner.hasNextInt()){
                key = myScanner.nextInt();
                if(key >= 0){
                    key = key;
                    break;
                }
                else{
                    System.out.println("You did not enter an integer greater than or equal to 0");
                    break;
                }
            }
            else{
                System.out.println("You did not enter an integer");
                break;
            }
        }    
        //Binary Search
         int high = array2.length;
         int low = 0;
         int mid = (high + low) / 2;
         
         while(high>=low){
             if(key < array2[mid]){
                 high = mid -1;
             }
             else if(key == array2[mid]){
                 System.out.println("The value" + key + " was found on Array 2 at: " + mid);
                 System.out.println("The above value is: " + array2[mid + 1]);
                 System.out.println("The bottom value is: " + array2[mid - 1]);
                 break;
             }
             else if(key > array2[mid]){
                 low = mid + 1;
             }
             else{
                System.out.println("The value " + key + "was not found");
                System.out.println("The above value is: " + array2[mid + 1]);
                System.out.println("The bottom value is: " + array2[mid - 1]);
                break;

             }
             
         }
        
    }
    
}