package day1;
import java.util.*;
public class CalcPower
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base integer: ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent integer: ");
		int exponent = sc.nextInt();

		double ans = Math.pow(base, exponent);
		System.out.println("Your answer is: " + ans);
	}
}