package day1;
import java.util.*;
public class KMsToMiles
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Kilo meters: ");
		double kiloMeters = sc.nextDouble();

		double miles = kiloMeters * 0.621371;
		System.out.println(kiloMeters + " KiloMeters in miles is: " + miles + " miles");
	}
}