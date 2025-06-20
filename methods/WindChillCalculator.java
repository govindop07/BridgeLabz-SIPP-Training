package methods;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * windSpeed;
    }

    public static void main(String[] args) {
        double temp = 10.0, windSpeed = 5.0;
        System.out.println("Wind Chill: " + calculateWindChill(temp, windSpeed));
    }
}
