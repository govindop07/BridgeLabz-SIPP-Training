package methods;
import java.util.*;
public class SmallestAndLargestAmongThree {
	
	public static int[] smallestLargest(int num1, int num2, int num3) {
		int[] ans = new int[2];
		if(num1 < num2 && num1 < num3) ans[0] = num1;
		else if(num2 < num1 && num2 < num3) ans[0] = num2;
		else ans[0] = num3;
		
		if(num1 > num2 && num1 > num3) ans[1] =  num1;
		else if(num2 > num1 && num2 > num3) ans[1] =  num2;
		else ans[1] = num3;
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		int[] ans = smallestLargest(num1, num2, num3);
		System.out.println("The samallest among these three numbers is " + ans[0] + " and largest is " + ans[1]);

	}

}
