package leetcode.slidingwindowTut.fixed;

public class MinimumDifferenceBetweenHighestandLowestofKScores {

    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7};
        int k = 2;
        System.out.println(new MinimumDifferenceBetweenHighestandLowestofKScores().minimumDifference(arr, k));
    }

    public int minimumDifference(int[] arr, int k) {

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int difference = (Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]));
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }
        return minDifference;
    }

}