import java.util.*;
public class insertion_short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
           int temp=arr[i];
           int j=i-1;
           while(j>=0 && temp<arr[j]){
            arr[j+1]=arr[j];
            j--;
           }
           arr[j+1]=temp;
           
        }
        System.out.println("insertion array is:");
        for(int i=0;i<N;i++)
        {
System.out.print(arr[i]);
        }

    }
    
}
