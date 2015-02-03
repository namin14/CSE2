//Nehla Amin
//CSE 002
//Section 110
//February 3, 2015

public class Arithmetic{
    
    public static void main(String args[]){
        
        //Sales Tax Percent
        double taxPercent= 0.06;
        
        //Number of pairs of socks
        int nSocks= 3;
        
        //Cost per pair of socks
        double socksCost$= 2.58;
        
        //Calculation of the cost of socks and its sales tax
        double totalSockCost$= nSocks * socksCost$;
        double salesTaxSocks$= totalSockCost$ * taxPercent;
        
        //Print out information
        System.out.println("The first item bought are several pairs of socks.");
        System.out.println("The number of socks purchased were " + nSocks + " pairs.");
        System.out.println("The price for each pair of socks is $" + socksCost$ + ".");
        System.out.println("The cost is $" + (int)(totalSockCost$ * 100) / 100.0 + " for that purchase.");
        System.out.println("The sales tax for that purchase of socks is $" + (int)(salesTaxSocks$*100) / 100.0 + ".");
        System.out.println(" ");
        
        //Number of drinking glasses
        int nGlasses= 6;
        
        //Cost per drinking glass
        double glassCost$= 2.29;
        
        //Calculation of the cost of glass and its sales tax
        double totalGlassCost$= nGlasses * glassCost$;
        double salesTaxGlass$= totalGlassCost$ * taxPercent;
        
        //Print out information
        System.out.println("The second item bought are several drinking glasses.");
        System.out.println("The number of glasses purchased were " + nGlasses + ".");
        System.out.println("The price for each drinking glass is $" + glassCost$ + ".");
        System.out.println("The cost is $" + (int)(totalGlassCost$ * 100) / 100.0 + " for that purchase.");
        System.out.println("The sales tax for that purchase of drinking glasses is $" + (int)(salesTaxGlass$ * 100) / 100.0 + ".");
        System.out.println(" ");
        
        // Number of boxes of envelopes
        int nEnvelopes= 1;
        
        //Cost per box of envelopes
        double envelopeCost$= 3.25;
        
        //Calculation of the cost of envelopes and its sales tax
        double totalEnvelopeCost$= nEnvelopes * envelopeCost$;
        double salesTaxEnvelopes$= totalEnvelopeCost$ * taxPercent;
        
        //Print out information
        System.out.println("The third item bought is a box of envelopes.");
        System.out.println("The number of boxes purchased is " + nEnvelopes + ".");
        System.out.println("The price for each box is $" + envelopeCost$ + ".");
        System.out.println("The cost is $" + (int)(totalEnvelopeCost$ * 100) / 100.0 + " for that purchase.");
        System.out.println("The sales tax for that purchase of envelopes is $" + (int)(salesTaxEnvelopes$ * 100) / 100.0 + ".");
        System.out.println(" ");
        
        //Calculate and print total cost of all purchases before tax
        double totalCostBefore$= totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        
        //Calculate and print total sales tax of all purchases
        double totalSalesTax$= salesTaxSocks$ + salesTaxGlass$ + salesTaxEnvelopes$;
        
        //Calculate and print total cost of all purchases after tax
        double totalCostAfter$= totalCostBefore$ + totalSalesTax$;
        
        //Print out information
        System.out.println("The total cost of purchases before the sales tax is $" + (int)(totalCostBefore$ * 100) / 100.0 + ".");
        System.out.println("The total sales tax is $" + (int)(totalSalesTax$ * 100) / 100.0 + ".");
        System.out.println("The cost of all the purchases after tax is $" + (int)(totalCostAfter$ * 100) / 100.0 + ".");
        
        //The trick used throughout the program to calculate an answer out to 2 decimal places is inaccurate because it does not take rounding into account
        //Instead, when a calculated cost is explicitely casted from a double to an integer, any decimal point after the answer is removed. By dividing the int answer by 100.0, the calculated number returns to being a double type.
        
    }
    
}