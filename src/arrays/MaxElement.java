package arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of mountains in this testcase
            int[] heights = new int[n];

            // Input heights of mountains
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }

            // Find the maximum height
            int max_height = findMax(heights);
            System.out.println(max_height);
        }

    }

    // Function to find the maximum height
    private static int findMax(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

}
