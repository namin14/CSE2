//Nehla Amin
//CSE2
//April 13, 2015

//Program 11: Fun with Searching
//Objective: Input 15 integers into the array. Sort the array from smallest to greatest number.
//Search for the grade using linear search and binary search

import java.util.Scanner;

public class CSE2Linear{
    
    public static void main(String[] args){
        
        //Declare Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Make array
        int [] array = new int[15]; 
        
        //Check if inputs are integers b/t 0 and 100 and are in order
        System.out.println("Enter 15 integers for the final grades of CSE2: ");
        
        for(int i = 1; i < array.length; i++){
            
            if(myScanner.hasNextInt()){
                int grade = myScanner.nextInt();
                
                if(grade >= 0 && grade <= 100){
                    array[i] = grade;
                    
                    if(array[i] >= array[i-1]){
                        array[i] = grade;
                    }
                    
                    else{
                        System.out.println("Sorry, you must enter the grades in order from smallest to largest");
                        myScanner.next();
                        i--;
                    }
                }
                else{
                    System.out.println("Sorry, you must enter a grade between 0 and 100");
                    myScanner.next();
                    i--;
                }
                
            }
            
            else{
                System.out.println("Sorry, you must enter an integer.");
                myScanner.next();
                i--;
            }
            
        }
        
        //Print out Sorted array
        System.out.println("The sorted array is: " + array);
        
        //Prompt Binary Search
        System.out.println("Enter a grade to search: ");
        int grade = 0;
        while(myScanner.hasNext()){
            if(myScanner.hasNextInt()){
                grade = myScanner.nextInt();
                break;
            }
            else{
                System.out.println("Sorry You must enter an integer: ");
                myScanner.next();
            }
        
        }
        
        int iteration = binarySearch(grade, array);
        if(iteration <= 4){
            System.out.println(grade + " was found in the array after " + iteration + " iterations");
        }
        else{
            System.out.println(grade + " was not found in the list after 4 iterations.");
            
        }
        //Test Statement: System.out.println("The grade is: " + grade);
        
        //Scramble array
        int [] scrambled = scramble(array);
        System.out.println("The scrambled array is: " + scrambled);
        
        //Prompt Linear Search
        System.out.println("Enter a grade to search: ");
        int grade2 = 0;
        while(myScanner.hasNext()){
            if(myScanner.hasNextInt()){
                grade2 = myScanner.nextInt();
                break;
            }
            else{
                System.out.println("Sorry You must enter an integer: ");
                myScanner.next();
            }
        
        }
        int iterationLin = linearSearch(array, grade2);
        if(iterationLin != -1){
            System.out.println(grade2 + " was found in the list with " + iterationLin + "iterations");
        }
        else{
            System.out.println(grade2 + " was able to be found on the scrambled list");
        }
        
    }//End of main
    
    //Binary Search method
    public static int binarySearch(int x, int [] list){
        int min = 0;
        int max = list.length - 1;
        int q = 1;
        
        //while(q>0){
        
        while(max >= min){
            while(q>0){
                int mid = (min+max)/2;
            if(x < list[mid]){
                q++;
                max = mid - 1;
            }
            else if(x == list[mid]){
                return q;
            }
            else{
                q++;
                min = mid + 1;
            }
            return q;
            
        }
        return q;
        }
        return q;
    }
    
    //Scramble method
    public static int [] scramble(int [] list){
        for(int i = 0; i<list.length; i++){
            int index = (int)(Math.random()*list.length);
            int temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }
        return list;
    }
    //Linear Search method
    public static int linearSearch(int [] list, int x){
        for(int i = 0; i< list.length; i++){
            if(x == list[i]){
                return i;
            }
            return -1;
        }
        return;
    }
}//End of Class