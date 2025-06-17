package Arrays;

import java.util.*;
public class findTheSumOf10Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        double sum = 0;
        double nums[] = new double[10];
        int idx = 0;
        while(idx < 10){
            nums[idx] = sc.nextDouble();
            if(nums[idx] <= 0) break;
            sum += nums[idx++];
        }

        System.out.println("All the numbers that you entered are: " + Arrays.toString(nums));
        System.out.println("The sum of all numbers is " + sum);
    }
}
