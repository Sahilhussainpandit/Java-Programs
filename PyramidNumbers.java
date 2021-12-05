import java.util.Scanner; 
public class PyramidNumbers
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of lines:");
int lines = sc.nextInt();
System.out.print("");
for (int i=1; i<=lines; i++)
{
  for (int j=1; j<=(lines-i)*2; j++)
{
  System.out.print(" ");
  }
for (int k=i; k>=1; k--)
{
  System.out.print(" "+k);           
}                                        
for (int l=2; l<=i; l++)
{
  System.out.print(" "+l);    
}                           
System.out.println();
}                                                 
}
}