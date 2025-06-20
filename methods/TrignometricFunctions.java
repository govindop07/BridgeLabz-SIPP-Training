package methods;
import java.util.*;
public class TrignometricFunctions {
	
	public static double[] findTrignometricFunction(double degree) {
		double ans[] = new double[3];
		double radians = (degree * Math.PI)/180;
		ans[0] = Math.sin(radians);
		ans[1] = Math.cos(radians);
		ans[2] = Math.tan(radians);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degrees for which you want to find sin, cos and tan values: ");
		double degree = sc.nextDouble();
		
		double[] functions =  findTrignometricFunction(degree);
		System.out.println("sin: " + functions[0]);
		System.out.println("cos: " + functions[1]);
		System.out.println("tan: " + functions[2]);

	}

}
