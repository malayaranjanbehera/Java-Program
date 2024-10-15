import java.util.*;
public class evenSum {
    public static void main(String args[]){
        System.out.println("enter N");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<=N;i++){
            if(i%2==0){
                sumeven=sumeven+i;
            }
            
            else {
                sumodd=sumodd+i;
            }
        }

        System.out.println("sum of even number is:"+sumeven);
        System.out.println(sumodd);
    

    }
    
}
