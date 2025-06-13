package day1;
import java.util.*;
public class CalcSimpleInterest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your principle amount: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time taken(int years): ");
		double time = sc.nextDouble();

		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Your total simple interest is: " + simpleInterest);
	}
}