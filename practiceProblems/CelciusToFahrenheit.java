package day1;
import java.util.*;
public class CelciusToFahrenheit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in celcius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("The temperature is: " + fahrenheit + " fahrenheit");
	}
}