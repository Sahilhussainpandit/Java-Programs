import java.util.Scanner;
public class MaximumNumbers
{
	public static void main(String[] ar)
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number : ");				
		int first = sc.nextInt();
		System.out.print("Enter the second number : ");				
		int second = sc.nextInt();
		if(first > second)											
			System.out.println(first+" is maximum than "+second);
		else if(second > first)
			System.out.println(second+" is maximum than "+first);
		else
			System.out.println("Both numbers are Equal");
		sc.close();
													
	}
}