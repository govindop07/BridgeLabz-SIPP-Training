package Arrays;

import java.util.*;
public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = 0;
        int temp = num;
        while(temp > 0) {
            temp /= 10;
            digitCount++;
        }


        int[] digits = new int[digitCount];
        for(int i=0; i<digitCount; i++) {
            int digit = num % 10;
            digits[i] = digit;

            num /= 10;
        }

        System.out.println("The digits of that number in reversed order are: ");
        for(int i=0; i<digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
