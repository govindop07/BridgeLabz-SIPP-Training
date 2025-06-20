package methods;
import java.util.*;
public class PositiveNegativeOrZero {
	
	public static void check(int num) {
		if(num == 0) System.out.println("This number is a zero.");
		if(num > 0) System.out.println("This is a positive number.");
		if(num < 0) System.out.println("This is a negative number.");
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int number = sc.nextInt();
		 check(number);

	}

}
