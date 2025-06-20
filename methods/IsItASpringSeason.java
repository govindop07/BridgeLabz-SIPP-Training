package methods;

import java.util.*;
public class IsItASpringSeason {

    public static boolean isSpring(int month, int day){
        // Spring Season is from March 20 to June 20
        if(month < 3 || month > 6) return false;
        else if(month == 3 && day < 20) return false;
        else if(month == 6 && day > 20) return false;
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month(1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter the day(1-30): ");
        int day = sc.nextInt();

        boolean spring = isSpring(month, day);
        System.out.println("This is a spring time: " + spring);
    }
}
