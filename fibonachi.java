import java.util.*;
public class fibonachi {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of N");
        int N=sc.nextInt();
        int t1=0;int t2=1;
        int nxt=t1+t2;
        System.out.println("enter the number");
        for(int i=3;i<=N;i++)
        {
            System.out.println(nxt);
            t1=t2;
            t2=nxt;
            nxt=t1+t2;
        }
        System.out.println("fibonachi series is="+nxt);
    }
    
}
