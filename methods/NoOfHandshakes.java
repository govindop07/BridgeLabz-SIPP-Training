package methods;
import java.util.*;
public class NoOfHandshakes {
	
	public static int noOfHandShakes(int totalStudents) {
		return (totalStudents*(totalStudents-1)) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int totalStudents = sc.nextInt();
		
		int noOfHandshakes = noOfHandShakes(totalStudents);
		System.out.println("Total number of handshakes can be: " + noOfHandshakes);

	}

}
