import java.util.*;
class Bank{
private double bal=5000;
private int pwd;


//First Function:
public void Deposite(double money){
    System.out.println("Enter passWord:");
    Scanner sc=new Scanner(System.in);
    pwd=sc.nextInt();
    if(pwd==123){
        bal=bal+money;
        System.out.println("Deposite money is:"+money);
        System.out.println("Total balance is:"+bal);
    }
    else
    {
        System.out.println("Invalid passWord:");
    }
    }

    //Second Function:

    public void withdrow(double money){
        System.out.println("Enter passWord:");
    Scanner sc=new Scanner(System.in);
    pwd=sc.nextInt();
    if(pwd==123){
        bal=bal-money;
        System.out.println("withdrow Balance is:"+money);
        System.out.println("total balance is:"+bal);
    }
    else{
        System.out.println("Invalid Password:");
    }
    }
    //Third Function
    public void checkBal(){
        System.out.println("Enter passWord:");
    Scanner sc=new Scanner(System.in);
    pwd=sc.nextInt();
    if(pwd==123){
    System.out.println("Total balance is:");
    }
    else{
        System.out.println("Invalid PassWord");
    }
    }

}



public class BankCreation {
    public static void main(String[] args) {
        Bank obj=new Bank();
        int ch;
        System.out.println("1.Deposite:");
        System.out.println("2.withdrow:");
        System.out.println("3.CheckBalance:");

        System.out.println("Enter your choice:");
        Scanner se=new Scanner(System.in);
        ch=se.nextInt();

        switch (ch) {
            case 1:
                obj.Deposite(5000);
                break;
        
            case 2:
            obj.withdrow(1000);
            break;

            case 3:
            obj.checkBal();
            break;

            default: