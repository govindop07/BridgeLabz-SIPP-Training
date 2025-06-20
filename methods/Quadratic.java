package methods;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            return new double[]{ (-b - Math.sqrt(delta)) / (2 * a), (-b + Math.sqrt(delta)) / (2 * a) };
        } else if (delta == 0) {
            return new double[]{ -b / (2 * a) };
        } else {
            return new double[]{}; // no real roots
        }
    }

    public static void main(String[] args) {
        double[] roots = findRoots(1, -3, 2);
        if (roots.length == 0) System.out.println("No Real Roots");
        else for (double root : roots) System.out.println("Root: " + root);
    }
}
