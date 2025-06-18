package strings;

public class CustomNullPointerException {
    public static void generateException() {
        String text = null;
        System.out.println("Accessing length of a null string...");
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println("Accessing length of a null string...");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}
