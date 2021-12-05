import java.util.Scanner;
public class FactorialRecursion 
{
	public static long findFact(long num) {
		if(num <= 0) {
		return 1;
		} 
		return num * findFact(num-1);
            }
	        public static void main(String[] ar) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = sc.nextLong();
	        long fact = findFact(num);
		System.out.println("Factorial of " + num + " is: " + fact);
		sc.close();
	}
}