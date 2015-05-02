import java.util.Random;
import java.util.Scanner;

public class methods{
    
    public static void main(String [] args){
        
        //Declare random object
        Random number = new Random();
        
        //Declare scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Declare variables
        int q = 0;
        int limit = 6;// + number.nextInt(10);
        int counter = 1;
        String A ="";
        String sentence ="";
        
        while(counter > 0){
        for(int i = 0; i<limit; i++){
            int j = number.nextInt(4);
            
            if(j == 0){
                A = adjective(number);
            }
            else if(j == 1){
                A = subject(number);
            }
            else if(j == 2){
                A = pastTense(number) + " the ";
            }
            else if(j == 3){
                A =  object(number);
            }
            
            sentence = sentence + A + " ";
        }
        System.out.println(limit);
        System.out.println("The " + sentence + "" + object(number) + ".");
        System.out.println("Generate a new sentence? Y or y for yes: ");
        
        String answer = myScanner.next();
        if(answer.equals("Y") || answer.equals("y")){
            sentence = "";
            continue;
        }
        
        else {
            break;
        }
        }    
    }
    
    //Adjective
    public static String adjective(Random number){
        int q = number.nextInt(10);
        String k ="";

        switch(q){
                        
            case 0:
            k = "quick";
            break;
                    
            case 1:
            k = "brown";
            break;
                    
            case 2:
            k = "strange";
            break;
                    
            case 3:
            k = "bored";
            break;
                    
            case 4:
            k = "happy";
            break;
                    
            case 5:
            k = "sad";
            break;
                    
            case 6:
            k = "pink";
            break;
                    
            case 7:
            k = "wise";
            break;
                    
            case 8:
            k = "tired";
            break;
                    
            case 9:
            k = "ugly";
            break;
        }//End of Switch
                    
        return k;            
    }
    
    //Subject nouns
    public static String subject(Random number){
        int q = number.nextInt(10);
        String k ="";

        switch(q){
                        
            case 0:
            k = "cow";
            break;
                    
            case 1:
            k = "horse";
            break;
                    
            case 2:
            k = "fox";
            break;
                    
            case 3:
            k = "person";
            break;
                    
            case 4:
            k = "bird";
            break;
                    
            case 5:
            k = "spider";
            break;
                    
            case 6:
            k = "dinosaur";
            break;
                    
            case 7:
            k = "boar";
            break;
                    
            case 8:
            k = "dog";
            break;
                    
            case 9:
            k = "cat";
            break;
        }//End of Switch
                    
        return k;
    }
    
    //past-tense verbs
    public static String pastTense(Random number){
        int q = number.nextInt(10);
        String k ="";

        switch(q){
                        
            case 0:
            k = "jumped";
            break;
                    
            case 1:
            k = "walked to";
            break;
                    
            case 2:
            k = "followed";
            break;
                    
            case 3:
            k = "hugged";
            break;
                    
            case 4:
            k = "ate";
            break;
                    
            case 5:
            k = " cheered for ";
            break;
                    
            case 6:
            k = "helped";
            break;
                    
            case 7:
            k = "listened to";
            break;
                    
            case 8:
            k = "talked to";
            break;
                    
            case 9:
            k = "ignored";
            break;
        }//End of Switch
                    
        return k;
    }
    
    //Object nouns
    public static String object(Random number){
        int q = number.nextInt(10);
        String k ="";

        switch(q){
                        
            case 0:
            k = "cow";
            break;
                    
            case 1:
            k = "horse";
            break;
                    
            case 2:
            k = "fox";
            break;
                    
            case 3:
            k = "person";
            break;
                    
            case 4:
            k = "bird";
            break;
                    
            case 5:
            k = "spider";
            break;
                    
            case 6:
            k = "dinosaur";
            break;
                    
            case 7:
            k = "boar";
            break;
                    
            case 8:
            k = "dog";
            break;
                    
            case 9:
            k = "cat";
            break;
        }//End of Switch
                    
        return k;
    }
    
}