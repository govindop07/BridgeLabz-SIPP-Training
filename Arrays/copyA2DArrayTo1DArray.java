package Arrays;

import java.util.*;
public class copyA2DArrayTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int array[] = new int[rows * columns];
        int idx = 0;
        for(int i=0; i<rows; i++) {
            System.out.println("Enter the elements of " + i + " row");
            for(int j=0; j<columns; j++) {
                array[idx++] = sc.nextInt();
            }
        }
    }
}
