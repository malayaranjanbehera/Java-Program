import java.util.*;
public class palindarm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int N=sc.nextInt();
        int rev=0;
        int i=1;
        int T=N;
        while(N!=0){
            int rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        if(T==N)
        System.out.println("pelindarm number is="+rev);
        else
        System.out.println(rev+"--not a palindrem number");

    }
    
}
