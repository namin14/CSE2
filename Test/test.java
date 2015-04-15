public class test{
    
    public static void main(String args[]){
        
        int i=0, j;
        
        while (i<5){
            j=0;
            while(j<6){
                System.out.println("Pawn At: "+i+j);
                j++;
                break;
            }
            i++;
        }
        
    }
}