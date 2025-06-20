package methods;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        int[] ages = {17, 18, 22, 16, -1, 20, 19, 15, 23, 21};
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Student " + (i + 1) + ": " +
                (canStudentVote(ages[i]) ? "Can vote" : "Cannot vote"));
        }
    }
}
