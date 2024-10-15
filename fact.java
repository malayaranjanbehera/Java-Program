import java.util.*; 
 
 public class fact {
    public static void main(String args[]){
      Scanner dScanner=new Scanner(System.in);
      int n=dScanner.nextInt();
      int fact=1;
      if(n<1){
        System.out.println("invalid number:");
      }
      
      for(int i=1;i<=n;i++){
        fact=fact*i;
          }
          System.out.println(fact);

      }
    
    

    }
    

