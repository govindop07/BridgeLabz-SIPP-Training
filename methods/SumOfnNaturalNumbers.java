package methods;
import java.util.*;
public class SumOfnNaturalNumbers {
	
	public static int findSum(int n) {
		int ans = 0;
		for(int i=1; i<=n; i++) {
			ans += i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = findSum(n);
		System.out.println("The sum of natural numbers till n is : " + sum);
	}

}
