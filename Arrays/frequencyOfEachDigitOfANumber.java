package Arrays;

import java.util.*;
public class frequencyOfEachDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int totalDigits = 0;
        while(temp > 0) {
            totalDigits++;
            temp /= 10;
        }
        System.out.println(totalDigits);
        
        int digits[] = new int[totalDigits];
        int digitCount[] = new int[10];
        for(int i=0; i<totalDigits; i++) {
            int digit = number % 10;
            digits[i] = digit;
            digitCount[digit]++;
            number /= 10;
        }
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(digitCount));

        for(int i=0; i<10; i++) {
            if(digitCount[i] > 0) {
                System.out.println(i + ": " + digitCount[i]);
            }
        }
    }
}
