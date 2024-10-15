import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Two number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
      int result=1;
        System.out.println("enter a character:");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case '+':
             result=num1+num2;
                break;
            
                case '-':
             result=num1-num2;
                break;

                case '*':
             result=num1*num2;
                break;

                case '/':
             result=num1/num2;
                break;
                default:
        
                break;
        }

        System.out.println("operation of Two Num is:"+result);
    }
}
