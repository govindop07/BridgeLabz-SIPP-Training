package Arrays;

import java.util.*;
public class printOddAndEvenTillANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int[] even = new int[number/2];
        int[] odd = new int[(number/2) + 1];
        
        int i = 0, j = 0;
        for(int k=1; k<=number; k++){
            if(k % 2 != 0) odd[i++] = k;
            else even[j++] = k;
        }

        System.out.println("The odd numbers are :" + Arrays.toString(odd));
        System.out.println("The even numbers are :" + Arrays.toString(even));
    }
}
