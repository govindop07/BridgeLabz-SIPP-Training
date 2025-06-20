package methods;

public class NumberCheck {
    public static void main(String[] args) {
        int[] arr = {12, -5, 3, 8, 12};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is Positive and Even");
                else
                    System.out.println(arr[i] + " is Positive and Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        if (arr[0] > arr[4])
            System.out.println("First is Greater");
        else if (arr[0] < arr[4])
            System.out.println("First is Smaller");
        else
            System.out.println("First and Last are Equal");
    }
}
