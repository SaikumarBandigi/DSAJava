package chatgpt.arrayTUT;

public class RightRotateAnArrayByKPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missingNumberWithNoDuplicate(arr));
    }

    static int missingNumberWithNoDuplicate(int[] arr) {

        int size = arr.length + 1;
        int expectedSum = size * (size + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
