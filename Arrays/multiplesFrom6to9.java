package Arrays;

import java.util.*;
public class multiplesFrom6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the multiples from 6 to 9");
        int number = sc.nextInt();

        for(int i=6; i<=9; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
