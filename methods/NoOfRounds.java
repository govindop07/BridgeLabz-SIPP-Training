package methods;
import java.util.*;
public class NoOfRounds {
	
	public static int noOfLaps(int num1, int num2, int num3) {
		int target = 5000;
		int parameter = num1+num2+num3;
		
		int laps =  target/parameter;
		
		return laps;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the first side of the triangle(in meters): ");
		int num1 = sc.nextInt();
		System.out.println("Enter the length of the second side of the triangle(in meters): ");
		int num2 = sc.nextInt();
		System.out.println("Enter the length of the third side of the triangle(in meters): ");
		int num3 = sc.nextInt();
		
		int laps = noOfLaps(num1, num2, num3);
		System.out.println("The minimum number of laps he needs to complete is: " + laps);


	}

}
