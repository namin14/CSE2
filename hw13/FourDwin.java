//Nehla Amin
//CSE2
//May 1, 2015
//Program 13: The Fourth Dimension
//Objective: Creat a ragged multidimsional array and implement methods which sort and find the sum, mean, and number of elements

import java.util.Scanner;

public class FourDwin{
    
    public static void main(String []args){
        
        //declare scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //create multi-dimensional array
        int x=0;
        int y=0;
        
        //input and validate x-integer
        System.out.println("Enter and integer X: ");
        
        int q=1;
        
        while(q>0){
            
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                if(x>0){
                    break;
                }
                else{
                    int badInput = x;
                    System.out.println("Please re-enter a positive integer: ");
                    myScanner.nextInt();
                }
            }
            
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
                myScanner.nextInt();
            }
            
        }//end of while loop for x
        
        //input and validate y-integer
        System.out.println("Enter an integer Y where Y > X: ");
        
        while(q>0){
            
            if(myScanner.hasNextInt()){
                y = myScanner.nextInt();
                if(y>x){
                    break;
                }
                else{
                    int badInput = x;
                    System.out.println("Please re-enter a positive integer greater than X: ");
                    myScanner.nextInt();
                }
            }
            
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
                myScanner.nextInt();
            }
            
        }//end of while loop for y
        
        //create multidimensioanl array
        double [][][] fourDArray = new double [x][y][3];

        
        //fill array with elements
        for(int i = 0; i < 3; i++){
            
            for(int row = 0; row < fourDArray.length; row++){
            
                for(int column = 0; column < fourDArray[row].length; column++){
                
                    fourDArray[row][column][i] = (Math.random() * 30);
                }
                
            }
            
        }
        
        //print intial array
        String picture1 = printArray(fourDArray);
        System.out.println(picture1);
        
        //print out sorted array
        
        //print out statistics
        double [] matrixStatistics = statArray(fourDArray);
        
        System.out.println("Sum: " + matrixStatistics[0]);
        System.out.println("Members: " + matrixStatistics[1]);
        System.out.println("Mean: " + matrixStatistics[2]);
        
        //-sort 3D array
        double [][][] sort3darray = sort3DArray(fourDArray);
        String picture2 = printArray(sort3darray);
        System.out.println("\n");
        System.out.println(picture2);
        
        //-sort 4D array and print
        //double [][][] sort4darray = sort4dArray(sort3darray);
        //String picture3 = printArray(sort4darray);
        //System.out.println(picture3);
        
        
    }//end of main
    
    //methods
    
    //statArray
    public static double [] statArray(double [][][] array){
        double totalSum = 0;
        double members = 0;
        
        for(int i = 0; i < 3; i++){
            
            for(int row = 0; row < array.length; row++){
            
                for(int column = 0; column < array[row].length; column++){
                    
                    totalSum += array[row][column][i];
                    members += 1;
                }
                
            }
            
        }
        
        double mean = totalSum / members;
        
        double [] matrix = new double[3];
        matrix[0] = totalSum;
        matrix[1] = members;
        matrix[2] = mean;
        
        return matrix;
        
    }
    
    //sort 3D array elements
    public static double [][][] sort3DArray(double [][][] array){
        for(int i = 0; i < 3; i++){
            
            for(int row = 0; row < array.length; row++){
            
                for(int column = 1; column < array[row].length; column++){
                    
                    double value = array[row][column][i];
                    
                    int j = column - 1;
                    
                    while(j<column && array[row][j][i] > value){
                        array[row][column][i] = array [row][j][i];
                    }
                    
                     array[row][j][i] = value;
                }
                

            }
            
        }
        
        return array;
        
    }
    
    
    //sort 4D array in ascending order according to the first element of each array
    //public static double [][][] sort4darray(double [][][] array){
        //for(int i = 0; i < 3; i++){
            
            //for(int row = 0; row < array.length; row++){
            
                //for(int column = 0; column < array[row].length; column++){
                    //double key = array[row][col][i];
                    
                //}
                
            //}
            
        //}
        
        //return array;
    //}
    
    //print array
    public static String printArray(double [][][] array){
        
        String picture = "";
        for(int i = 0; i < 3; i++){
            
            for(int row = 0; row < array.length; row++){
            
                for(int column = 0; column < array[row].length; column++){
                    
                    picture = "[ " + picture  + array[row][column][i] + " ]" ;
                }
                
                String space1 = "";
            }
            String space2 = "\n";
        }
        return picture;
    }
    
}//end of class