package Arrays;

import java.util.*;
public class theFactorsOfANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        
        int[] nums = new int[number];
        int j = 0;
        for(int i=1; i<number; i++) {
            if(number % i == 0) {
                nums[j++] = i;
            }
        }

        System.out.println("The factors of the number " + number + " are");
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) break;
            System.out.println(" " + nums[i]);
        }
    }
}
