package methods;

public class NumberAnalysis {
    public static boolean isPositive(int num) { return num >= 0; }

    public static boolean isEven(int num) { return num % 2 == 0; }

    public static int compare(int a, int b) {
        return Integer.compare(a, b); // returns -1, 0, or 1
    }

    public static void main(String[] args) {
        int[] numbers = {12, -3, 5, 7, 12};

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("First and Last Comparison: " +
            (result == 0 ? "Equal" : (result > 0 ? "First > Last" : "First < Last")));
    }
}
