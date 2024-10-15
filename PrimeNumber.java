import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int flag=0;
        for(int i=1;i<=9;i++){
            if(a%i==0){
             flag=1;
             break;
            }
        }

        if(flag==0 && a!=0){
            System.out.println("not a Prime number is:"+a);
        }
        else{
            System.out.println("prime number:"+a);
        }
    }
}
