//Nehla Amin
//CSE 002
//Lab 02 Arithmatic Calculations
//January 30, 2015

public class Cyclometer{
    
    public static void main(String[] args){
        
        // Variables storing input data
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9937;
        
        double wheelDiameter=27.0;
        double PI=3.14159;
        double feetPerMile=5280;
        double inchesPerFoot=12;
        int secondsPerMinute=60;
        double distanceTrip1, distanceTrip2, totalDistance;
        
        int minutesTrip1=secsTrip1/secondsPerMinute;
        int minutesTrip2=secsTrip2/secondsPerMinute;
            
        //Print out Calculations for the minutes each trip took and the counts
        System.out.println("Trip 1 took " + (minutesTrip1) + " minutes and had " + (countsTrip1) + " counts.");
        System.out.println("Trip 2 took " + (minutesTrip2) + " minutes and had " + (countsTrip2) + " counts.");
        
        //Print out calculations for the distance covered by each trip and the total distance
        distanceTrip1=(countsTrip1*wheelDiameter*PI)/(inchesPerFoot/feetPerMile);
        distanceTrip2=(countsTrip2*wheelDiameter*PI)/(inchesPerFoot/feetPerMile);
        totalDistance= distanceTrip1 + distanceTrip2;
        
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was " + totalDistance + " miles");
        
    }
    
}