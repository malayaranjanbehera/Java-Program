import java.util.*;
public class TrafficLights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color(red,orange,green):");
        String color=sc.next();
        String action;
        switch (color) {
            case "red":
            action="stop";
                break;

                case "orange":
            action="ReadyToGo";
                break;

                case "green":
            action="Go";
                break;
        
            default:
            action="Invalid color";
        }

        System.out.println("Action is:"+action);
        
    }
}
