import java.util.*;

public class multiplicationArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter matrix element:");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    int mul2[][]=new int[row][col];
    int mul=1;

    System.out.println("enter a first matrix:");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++){
            a[i][j]=sc.nextInt();  
        }
    }
    System.out.println("enter a second matrix:");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++){
    
            b[i][j]=sc.nextInt();
        }
    }
    //one

    System.out.println("matix 1 is:");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(a[i][j] + "  ");
           
        }
        System.out.println();
    }

    //two
System.out.println("matrix 2 is:");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(b[i][j] + "  ");
       
    }
    System.out.println();
}
System.out.println("multiplication of two matrix is:");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++)
    {
        for(int k=0;k<3;k++)
        {
      mul=mul+a[i][k]*b[k][j];
      mul2[i][j]=mul;
 }
    }
}
System.out.println("multiplication array is");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++)
    {

System.out.print(mul2[i][j] + " ");
    }
    System.out.println();
}




}
    
}
