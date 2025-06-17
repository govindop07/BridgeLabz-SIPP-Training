package Arrays;

import java.util.*;
public class checkIfCanVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age age of all 10 students");
        int ages[] = new int[10];
        for(int i=0; i<10; i++){
            ages[i] = sc.nextInt();
        }

        for(int age: ages) {
            if(age >= 18) {
                System.out.println("The student with age " + age + " can vote");
            } else {
                System.out.println("The student with age " + age + " can not vote");
            }
        }
    }
}