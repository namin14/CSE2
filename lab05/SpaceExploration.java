public class SpaceExploration{
    
    public static void main(String [] args){
        
        int startYear = (int) (Math.random()* 11) + 2001;
        
        //String timeline = "Nothing";
        
        System.out.println("Here is a time line of the space exploration events between " + startYear + " and 2000: ");
            
            switch(startYear){
               
               case 2010:
               //timeline = 
               System.out.println("2010: SpaceX successfully sends a spacecraft to orbit and back.");
               
               case 2009:
               //timeline = 
               System.out.println("2009: N/A");
               
               case 2008:
               //timeline = 
               System.out.println("2008: Kepler launched to study deep space.");
               
               case 2007:
               //timeline = 
               System.out.println("2007: N/A");
               
               case 2006:
               //timeline = 
               System.out.println("2006: Spacecraft returns with collections from a comet.");
               
               case 2005:
               //timeline = 
               System.out.println("2005: Spacecraft collides with comet.");
               
               case 2004:
               //timeline = 
               System.out.println("2004: N/A");
               
               case 2003:
               //timeline = 
               System.out.println("2003: Largest Infrared telescope released.");
               
               case 2002:
               //timeline = 
               System.out.println("2002: N/A");
               
               case 2001:
               //timeline = 
               System.out.println("2001: First spacecraft lands on asteroid.");
               
               case 2000:
               //timeline = 
               System.out.println("2000: First spacecraft orbits an asteroid.");
               break;
               
               default: System.out.println("Timeline error");
                
            }//End of switch statement
        
    }
    
}