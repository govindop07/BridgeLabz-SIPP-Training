package day1;
import java.util.*;
public class ParemeterOfRactangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width = sc.nextDouble();

		double paremeter = 2 * (length + width);
		System.out.println("Paremeter of your rectangle is: " + paremeter);
	}
}