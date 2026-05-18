package leetcodecontest.weekly.Five02;

public class CountKthRootsinaRange {

    public static void main(String[] args) {

        int l = 8, r = 30, k = 2;
        System.out.println(new CountKthRootsinaRange().countKthRoots(l, r, k));
    }

    public int countKthRoots(int l, int r, int k) {

        int count = 0;

        for (int i = l; i <= r; i++) {
            if (isPerfectKthPower(i, k)) {
                count++;
            }
        }

        return count;
    }

    boolean isPerfectKthPower(int num, int k) {

        int root = (int) Math.round(Math.pow(num, 1.0 / k));
        return Math.pow(root, k) == num;
    }

}
