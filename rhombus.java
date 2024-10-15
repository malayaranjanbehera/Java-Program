public class rhombus {
    public static void main(String arr[]){
        int n=5;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
           System.out.println();
            
        }

    }
}
