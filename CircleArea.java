import java.util.Scanner;
public class CircleArea
{
    public static void main(String[] ar) 
    {
        int r;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of the circle: "+area);
    }            
}