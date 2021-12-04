import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] ar) {

		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter a Number: ");
		int n = input.nextInt();
		int a, s = 0, m = n;

		while (n != 0)
		{
			a = n % 10;
			s = s * 10 + a;
			n = n / 10;
		}

		if (m == s) 
			System.out.println(m + " is a Palindrome Number");
		else
			System.out.println(m + " is not a Palindrome Number");

	}
}