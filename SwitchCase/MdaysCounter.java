import java.util.*;

public class MdaysCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number(1-12):");
        int month=sc.nextInt();
        String MonName;
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            days=31;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            days=31;
                break;
                case 2:
                days=28;
        
            default:
                days=-1;
        }
        if(days!=-1){
            System.out.println("number of days in month:"+month+" :"+days);
        }
        else{
            System.out.println("invalid number");
        }
        

    }
}
