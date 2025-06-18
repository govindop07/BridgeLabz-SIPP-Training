package strings;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void generateException(String[] names) {
        System.out.println("Accessing index out of bounds...");
        System.out.println(names[names.length]); // This will throw an exception
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index out of bounds...");
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"zero", "one", "two"};
        
        handleException(names);
    }
}
