package Arrays;

import java.util.*;
public class largestAndSecondLargestDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextInt();

        int maxDigit = 0;
        int secMaxDigit = 0;

        while(num >= 10) {
            int temp = (int)num % 10;
            
            if(maxDigit < temp) {
                secMaxDigit = maxDigit;
                maxDigit = temp;
            } else if(temp > secMaxDigit) {
                secMaxDigit = temp;
            }
            num /= 10;
        }
        System.out.println("The highest digit is: " + maxDigit);
        System.out.println("The second highest digit is: " + secMaxDigit);
    }
}
