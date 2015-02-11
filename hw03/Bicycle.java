//Nehla Amin
//CSE 002
//Section 110
//February 10, 2014

//Program 1: Bicycle 
//Calculate the miles, minutes, and mph from number of seconds and counts

import java.util.Scanner;

public class Bicycle{
    
    public static void main(String[] args){
        
        //Declare Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Give number of counts
        System.out.println("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        //Give number of seconds per count
        System.out.println("Enter the number of seconds: ");
        double nSeconds = myScanner.nextInt();
        
        //Variable Storage
        double wheelDiameter = 27.0;
        double PI = 3.14159;
        double feetPerMile = 5280.0;
        double inchesPerFoot = 12.0;
        double secondsPerMinute = 60.0;
        double secondsPerHour = 3600.0;
        double distance, timeMinute, timeHour, mph;
        
        //Calculate Distance
        distance = (nCounts * wheelDiameter * PI) / (inchesPerFoot * feetPerMile);
        
        //Calculate Time
        timeMinute = nSeconds / secondsPerMinute;
        timeHour = nSeconds / secondsPerHour;
        
        //Calculate MPH
        mph = distance / timeHour;
        
        //Print Output
        System.out.println("The distance traveled was " + (int)(distance*100) / 100.0 + " miles and took " + (int)(timeMinute * 100) / 100.0 + " minutes.");
        System.out.println("The average mph was " + (int)(mph * 100) / 100.0);
        
    }
    
}