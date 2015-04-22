//Nehla Amin
//CSE2
//April 22, 2015
//Homework 12: Multiplying Matrices

//Objective: Constructing 2 multidimensional arrays containing random integers between -10 to +10 and multiplying them
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Multiply{
    
    public static void main(String []args){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Declare Random object
        Random entry = new Random();
        
        //Enter the number of rows and columns for Matrix A
        System.out.println("Please enter the number of rows for Matrix A: ");
        int rows1 = 0;
        
        for(int i = 1; i>0; i++){
            if(myScanner.hasNextInt()){
                rows1 = myScanner.nextInt();
                    if(rows1>0){
                        break;
                    }
                    else{
                        System.out.println("Please re-enter a positive integer: ");
                    }
            }
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
            }
        }
        
        System.out.println("Please enter the number of columns for Matrix A: ");
        int columns1 = 0;
        
        for(int i = 1; i>0; i++){
            if(myScanner.hasNextInt()){
                columns1 = myScanner.nextInt();
                    if(columns1>0){
                        break;
                    }
                    else{
                        System.out.println("Please re-enter a positive integer: ");
                    }
            }
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
            }
        }
        
        //Enter the number of rows and columns for Matrix B
        System.out.println("Please enter the number of rows for Matrix B: ");
        int rows2 = 0;
        
        for(int i = 1; i>0; i++){
            if(myScanner.hasNextInt()){
                rows2 = myScanner.nextInt();
                    if(rows2>0){
                        if(rows2 == columns1){
                            break;
                        }
                        else{
                            System.out.println("The rows for Matrix B must equal the columns from Matrix A");
                        }
                    }
                    else{
                        System.out.println("Please re-enter a positive integer: ");
                    }
            }
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
            }
        }
        
        System.out.println("Please enter the number of columns for Matrix B: ");
        int columns2 = 0;
        
        for(int i = 1; i>0; i++){
            if(myScanner.hasNextInt()){
                columns2 = myScanner.nextInt();
                    if(columns2>0){
                        break;
                    }
                    else{
                        System.out.println("Please re-enter a positive integer: ");
                    }
            }
            else{
                String badInput = myScanner.next();
                System.out.println("Please re-enter an integer: ");
            }
        }
        
        //Construct Matrices A and B
        int [][] MatrixA = randomMatrix(rows1, columns1, entry);
        int [][] MatrixB = randomMatrix(columns1, columns2, entry);
        
        System.out.print("Matrix A: \n" + Arrays.deepToString(MatrixA).replaceAll("],", "],\r\n"));
        System.out.println("\n");
        System.out.print("Matrix B: \n" + Arrays.deepToString(MatrixB).replaceAll("],", "],\r\n"));
        System.out.println("\n");
        
        
        //Multiply both matrices
        int [][] matrixProduct = matrixMultiply(MatrixA, MatrixB);
        System.out.print("Matrix A multiplied by Matrix B is: \n" + Arrays.deepToString(matrixProduct).replaceAll("],", "],\r\n"));
        
    }
    //Method in generating random matrices
    public static int [][] randomMatrix(int height, int width, Random entry){
        
        int [][] matrix = new int [height][width];
        int input;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                input = -10 + entry.nextInt(20);
                matrix[i][j] = input;
            }
            //System.out.print("\n");
        }
        
        return matrix;
    }
    //Method in multiplying matrices
    public static int [][] matrixMultiply(int [][] matrixA, int [][] matrixB){
        
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;
        int[][] matrixC = new int[rowsA][columnsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];
               }
           }
        }
       
       return matrixC;
        
    }
    
}