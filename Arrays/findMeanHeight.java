package Arrays;

import java.util.*;
public class findMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of all 11 players of the football team: ");
        
        double sum = 0;
        for(int i=0; i<=11; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("The mean height of all the players is: " + sum/11);
    }
}
