//Nehla Amin
//CSE 002
//Feburary 24, 2016

//HW 05 ToHex
//Objective: To convert 3 different numbers, each between 0 - 255, into hexadecimals

import java.util.Scanner;

public class ToHex{
    
    public static void main(String [] args){
    
    //Declare Variables
    int rDec, gDec, bDec =0;
    int rHexP1=0, rHexP2=0, gHexP1=0, gHexP2=0, bHexP1=0, bHexP2=0;
    String rHex1="0", rHex2="0", rHex="0", bHex1="0", bHex2="0", bHex="0", gHex1="0", gHex2="0", gHex="0";
    
    //Declare Scanner
    Scanner myRValue;
    myRValue = new Scanner(System.in);
    
    //Prompt RGB value input
    System.out.println("Please enter three numbers representing RGB Values: ");
  
    //r value
    if(myRValue.hasNextInt()){
        rDec = myRValue.nextInt();
    }
    else{
        myRValue.next();
        System.out.println("You must type an integer");
        return;
    }
    
    ////g value
    
    if(myRValue.hasNextInt()){
        gDec = myRValue.nextInt();
    }
    else{
        myRValue.next();
        System.out.println("You must type an integer");
        return;
    }
    
    //b value
    if(myRValue.hasNextInt()){
        bDec = myRValue.nextInt();
    }
    else{
        myRValue.next();
        System.out.println("You must type an integer");
        return;
    }
    
    //Converting R-Decimal value into a hexadecimal
        if(0 <= rDec && rDec <= 255){
           // rDec = myRValue.nextInt();
            
            //If the R value is between 0 and 15
            if(0 <= rDec && rDec <= 9){
                rHex1 = ""+rDec;
                System.out.println("The converted r value is: " + rHex1);
            }
            else if (rDec > 9 && rDec <= 15){
                
                    switch(rDec){
                        
                    case 10:
                    rHex1 = "A";
                    break;
                    
                    case 11:
                    rHex1 = "B";
                    break;
                    
                    case 12:
                    rHex1 = "C";
                    break;
                    
                    case 13:
                    rHex1 = "D";
                    break;
                    
                    case 14:
                    rHex1 = "E";
                    break;
                    
                    case 15:
                    rHex1 = "F";
                    break;
                    }//End of Switch
                    System.out.println("The converted r value is: "+rHex1);
            }
            
            //If the R value is between 16 and 255    
            else{
                rHexP1 = rDec/16;
                rHexP2 = rDec%16;
                
                if(0 <= rHexP1 && rHexP1 <= 9){
                rHex1 = Integer.toString(rHexP1);
                }
                
                else if (rHexP1 > 9 && rHexP1 <= 15){
                    
                    switch(rHexP1){
                        
                    case 10:
                    rHex1 = "A";
                    break;
                    
                    case 11:
                    rHex1 = "B";
                    break;
                    
                    case 12:
                    rHex1 = "C";
                    break;
                    
                    case 13:
                    rHex1 = "D";
                    break;
                    
                    case 14:
                    rHex1 = "E";
                    break;
                    
                    case 15:
                    rHex1 = "F";
                    break;
                    }//End of Switch
                }//End of Else-if
                
                if(0 <= rHexP2 && rHexP2 <= 9){
                    rHex2 = Integer.toString(rHexP2);
                    
                }
                else if(rHexP2 > 9){
                    switch(rHexP2){
                        
                    case 10:
                    rHex2 = "A";
                    break;
                    
                    case 11:
                    rHex2 = "B";
                    break;
                    
                    case 12:
                    rHex2 = "C";
                    break;
                    
                    case 13:
                    rHex2 = "D";
                    break;
                    
                    case 14:
                    rHex2 = "E";
                    break;
                    
                    case 15:
                    rHex2 = "F";
                    break;
                    
                    default: System.out.println("Conversion error");
                    }//End of Switch
                    
                }//End of Else-if statement
                
                rHex = rHex1 + rHex2;
            }
        }//End of rDec conversion
    
        else{
            System.out.println("You must enter an R value between 0 and 255.");
            return;
        }
        
        ////gDec Conversion
        
        if(0 <= gDec && gDec <= 255){
           // rDec = myRValue.nextInt();
            
            //If the G value is between 0 and 15
            if(0 <= gDec && gDec <= 9){
                gHex1 = Integer.toString(gDec);
            }
            else if (gDec > 9 && gDec <= 15){
                
                    switch(gDec){
                        
                    case 10:
                    gHex1 = "A";
                    break;
                    
                    case 11:
                    gHex1 = "B";
                    break;
                    
                    case 12:
                    gHex1 = "C";
                    break;
                    
                    case 13:
                    gHex1 = "D";
                    break;
                    
                    case 14:
                    gHex1 = "E";
                    break;
                    
                    case 15:
                    gHex1 = "F";
                    break;
                    }//End of Switch
                    System.out.println("The converted g value is: "+gHex1);
            }//End of Else-if statement
            
            //If the G value is between 16 and 255    
            else{
                gHexP1 = gDec/16;
                gHexP2 = gDec%16;
                
                if(0 <= gHexP1 && gHexP1 <= 9){
                gHex1 = Integer.toString(gHexP1);
                }
                
                else if (gHexP1 > 9 && gHexP1 <= 15){
                    
                    switch(gHexP1){
                        
                    case 10:
                    gHex1 = "A";
                    break;
                    
                    case 11:
                    gHex1 = "B";
                    break;
                    
                    case 12:
                    gHex1 = "C";
                    break;
                    
                    case 13:
                    gHex1 = "D";
                    break;
                    
                    case 14:
                    gHex1 = "E";
                    break;
                    
                    case 15:
                    gHex1 = "F";
                    break;
                    }//End of Switch
                }//End of Else-if
                
                if(0 <= gHexP2 && gHexP2 <= 9){
                    gHex2 = Integer.toString(gHexP2);
                    
                }
                else if(gHexP2 > 9){
                    switch(gHexP2){
                        
                    case 10:
                    gHex2 = "A";
                    break;
                    
                    case 11:
                    gHex2 = "B";
                    break;
                    
                    case 12:
                    gHex2 = "C";
                    break;
                    
                    case 13:
                    gHex2 = "D";
                    break;
                    
                    case 14:
                    gHex2 = "E";
                    break;
                    
                    case 15:
                    gHex2 = "F";
                    break;
                    
                    default: System.out.println("Conversion error");
                    }//End of Switch
                    
                }//End of Else-if statement
                
                gHex = gHex1 + gHex2;
            }//End of else
        }//End of gDec conversion
    
        else{
            System.out.println("You must enter an G value between 0 and 255.");
            return;
        }
        
        //////bDec conversion
        
        if(0 <= bDec && bDec <= 255){
            
            //If the B value is between 0 and 15
            if(0 <= bDec && bDec <= 9){
                bHex1 = Integer.toString(bDec);
            }
            else if (bDec > 9 && bDec <= 15){
                
                    switch(bDec){
                        
                    case 10:
                    bHex1 = "A";
                    break;
                    
                    case 11:
                    bHex1 = "B";
                    break;
                    
                    case 12:
                    bHex1 = "C";
                    break;
                    
                    case 13:
                    bHex1 = "D";
                    break;
                    
                    case 14:
                    bHex1 = "E";
                    break;
                    
                    case 15:
                    bHex1 = "F";
                    break;
                    }//End of Switch
                    System.out.println("The converted b value is: "+bHex1);
            }//End of Else-if statement
            
            //If the B value is between 16 and 255    
            else{
                bHexP1 = bDec/16;
                bHexP2 = bDec%16;
                
                if(0 <= bHexP1 && bHexP1 <= 9){
                bHex1 = Integer.toString(bHexP1);
                }
                
                else if (bHexP1 > 9 && bHexP1 <= 15){
                    
                    switch(bHexP1){
                        
                    case 10:
                    bHex1 = "A";
                    break;
                    
                    case 11:
                    bHex1 = "B";
                    break;
                    
                    case 12:
                    bHex1 = "C";
                    break;
                    
                    case 13:
                    bHex1 = "D";
                    break;
                    
                    case 14:
                    bHex1 = "E";
                    break;
                    
                    case 15:
                    bHex1 = "F";
                    break;
                    }//End of Switch
                }
                
                if(0 <= bHexP2 && bHexP2 <= 9){
                    bHex2 = Integer.toString(bHexP2);
                    
                }
                else if(bHexP2 > 9){
                    switch(bHexP2){
                        
                    case 10:
                    bHex2 = "A";
                    break;
                    
                    case 11:
                    bHex2 = "B";
                    break;
                    
                    case 12:
                    bHex2 = "C";
                    break;
                    
                    case 13:
                    bHex2 = "D";
                    break;
                    
                    case 14:
                    bHex2 = "E";
                    break;
                    
                    case 15:
                    bHex2 = "F";
                    break;
                    
                    default: System.out.println("Conversion error");
                    }//End of Switch
                    
                }//End of Else-if
                
                bHex = bHex1 + bHex2;
            }//End of Else
        }//End of bDec Conversion
    
        else{
            System.out.println("You must enter an B value between 0 and 255.");
            return;
        }
        
        System.out.println("The decimal numbers R:"+rDec+", G:"+gDec+", B:"+bDec+", is represented in hexadecimal as "+rHex1+rHex2+gHex1+gHex2+bHex1+bHex2);
        
    }//Main
    
}//Class

//Used Stack-overflow website on advice for using Integer.toString(IntegerVariable);
//Set variables to zero just in case of run time errors with initialization.