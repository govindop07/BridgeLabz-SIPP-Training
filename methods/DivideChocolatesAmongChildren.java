package methods;

import java.util.*;
public class DivideChocolatesAmongChildren {

    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] ans = new int[2];
        ans[0] = number / divisor;
        ans[1] = number % divisor;

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates: ");
        int totalChocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int totalChildren = sc.nextInt();

        int[] ans = findRemainderAndQuotient(totalChocolates, totalChildren);
        System.out.println("The number of chocolates that every child will have is: " + ans[0]);
        System.out.println("The number of chocolates is: " + ans[1]);
    }    
}
