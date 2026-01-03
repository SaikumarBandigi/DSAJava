public class Example5 {
    public static int sqrt(int n) {
        if (n < 2) return n;

        int low = 1, high = n / 2, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == n)
                return mid;

            if ((long) mid * mid < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(8));  // 2
        System.out.println(sqrt(16)); // 4

        System.out.println(Math.sqrt(25));
    }
}
