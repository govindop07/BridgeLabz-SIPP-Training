package methods;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is " + (isLeapYear(year) ? "a Leap Year" : "not a Leap Year"));
    }
}
