public class butterfly {
    /**
     * @param arrs
     */
    public static void main(String arrs[]){

        System.out.println();
        int n=5;
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
   int spaces=2* (n-i);
            for(j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }


        for(i=n; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
   int spaces=2* (n-i);
            for(j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}

