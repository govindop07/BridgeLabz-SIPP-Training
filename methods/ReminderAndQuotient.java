package methods;
import java.util.*;
public class ReminderAndQuotient {
	
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int ans[] = new int[2];
		ans[0] = number % 2;
		ans[1] = number / divisor;
		return ans;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Enter the divisor: ");
		int divisor = sc.nextInt();
		
		int[] ans = findRemainderAndQuotient(number, divisor);
		System.out.println("The Remainder is: " + ans[0] + " and the quatient is: " + ans[1]);
	}
}
