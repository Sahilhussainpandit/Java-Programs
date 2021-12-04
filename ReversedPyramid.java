import java.util.Scanner;
public class ReversedPyramid
{
 public static void main(String[] ar)
 { 
 int i,j,n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of Rows:");
     n = sc.nextInt();
    
 for(i=n;i>=1;i--)
     {
         for(j=i;j<n;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=(2*i-1);j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 }
}