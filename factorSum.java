import java.util.*;
public class factorSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                sum=sum+i;
            }
            
        }
        
        System.out.println("factors sum is="+sum);

    }

}
