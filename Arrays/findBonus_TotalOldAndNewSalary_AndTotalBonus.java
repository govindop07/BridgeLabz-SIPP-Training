package Arrays;

import java.util.*;
import java.util.Scanner;
public class findBonus_TotalOldAndNewSalary_AndTotalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salaries of the employees: ");
        double salaries[] = new double[10];
        for(int i=0; i<10; i++) {
            salaries[i] = sc.nextDouble();
        }

        System.out.println("Enter the Years of service of each employee: ");
        int yearsOfServices[] = new int[10];
        for(int i=0; i<10; i++) {
            yearsOfServices[i] = sc.nextInt();
        }

        double[] bonus = new double[10];
        double[] newSalaries = new double[10];
        for(int i=0; i<10; i++) {
            double bonusCur = 0;
            if(yearsOfServices[i] > 5) bonusCur = (salaries[i] * 5)/100;
            else  bonusCur = (salaries[i] * 2)/100;

            bonus[i] = bonusCur;
            newSalaries[i] = salaries[i] + bonusCur;
        }

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for(int i=0; i<10; i++){
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
            totalBonus += bonus[i];
        }
        System.out.println("The total bonus of the employees is: " + totalBonus);
        System.out.println("The total old salary of the employees is: " + totalOldSalary);
        System.out.println("The total new salary of the employees is: " + totalNewSalary);
    }
}