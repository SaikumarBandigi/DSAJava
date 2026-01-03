package assignments._5_arrays;

public class MaximumPopulation {
    public static void main(String[] args) {

        int[][] logs = {{1993, 1999}, {2000, 2010}};

        int res=maximumPopulation(logs);
        System.out.println(res);

    }

    public static int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for (int year = 1950; year <= 2050; year++) {
            population[year - 1950] = countPopulation(logs, year);
        }
        int minYear = Integer.MAX_VALUE, maxPopulation = Integer.MIN_VALUE;
        for (int index = 100; index >= 0; index--) {
            int population_ = population[index];
            if (population_ >= maxPopulation) {
                minYear = index + 1950;
                maxPopulation = population_;
            }
        }
        return minYear;
    }

    // Method to find the population in any given year. ...... O(n)
    private static int countPopulation(int[][] logs, int year) {
        int count = 0;
        for (int[] person : logs) {
            int birth = person[0], death = person[1];
            if (birth <= year && year < death) count++;
        }
        return count;
    }
}
