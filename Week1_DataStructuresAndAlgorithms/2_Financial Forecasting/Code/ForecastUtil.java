public class ForecastUtil {

    // Recursive method to calculate future value
    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using iteration (to avoid stack overflow for large inputs)
    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}
