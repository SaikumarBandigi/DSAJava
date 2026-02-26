package leetcode.stringmatching;

public class RotateString {
    public static void main(String[] args) {

        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));

    }

    public static boolean rotateString(String s, String goal) {

        for (int i = 1; i < s.length() + 1; i++) {
            String res = rotateRight(s, i);
            if (res.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static String rotateRight(String str, int k) {
        int n = str.length();
        if (n == 0) return str;

        // Handle cases where k > n
        k = k % n;

        // Convert to char array for in-place modification
        char[] arr = str.toCharArray();

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);

        return new String(arr);
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}

/*
rotate whole array
rotate first K elements
rotate remainging n-k el


 */
