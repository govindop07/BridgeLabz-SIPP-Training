package Arrays;

import java.util.*;
public class findPositiveNegativeAndEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        int nums[] = new int[5];
        for(int i=0; i<5; i++){
            nums[i] = sc.nextInt();
        }

        for(int num: nums) {
            if(num > 0) {
                if(num % 2 == 0) {
                    System.out.println(num + " is a positive even number");
                }
                else System.out.println(num + " is a positive odd number");

            } else if(num < 0) {
                System.out.println(num + " is a negative number");
            } else {
                System.out.println(num + " is a zero");
            }
        }
    }
}
