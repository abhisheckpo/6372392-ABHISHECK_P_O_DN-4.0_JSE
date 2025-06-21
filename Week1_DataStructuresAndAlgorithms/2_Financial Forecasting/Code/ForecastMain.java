public class ForecastMain {
    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.08; // 8% growth
        int years = 5;

        double recursiveForecast = ForecastUtil.forecastRecursive(initialInvestment, annualGrowthRate, years);
        double iterativeForecast = ForecastUtil.forecastIterative(initialInvestment, annualGrowthRate, years);

        System.out.printf("Recursive Forecast for %d years: %.2f%n", years, recursiveForecast);
        System.out.printf("Iterative Forecast for %d years: %.2f%n", years, iterativeForecast);
    }
}
