package leetcodecontest.weekly.Four487;

public class CountMonobitIntegers {
    public static void main(String[] args) {

        int num = 4; // 0 1 2 3 4
        System.out.println(countMonobit(num));  // 0 1 3

    }

    public static int countMonobit(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String present = getBinaryString(i); // 3  11
            if (areAllSame(present)) {
                count++;
            }
        }
        return count;
    }

    static String getBinaryString(int num) {
        return Integer.toBinaryString(num);
    }

    static boolean areAllSame(String s) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) != s.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }


}


