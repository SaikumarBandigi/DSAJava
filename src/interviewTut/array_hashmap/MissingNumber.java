package interviewTut.array_hashmap;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3};
        System.out.println(new MissingNumber().getThatMissing(arr));
    }

    int getThatMissing(int[] arr) {

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

}
