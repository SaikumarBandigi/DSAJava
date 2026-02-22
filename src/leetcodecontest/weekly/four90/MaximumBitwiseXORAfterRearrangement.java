package leetcodecontest.weekly.four90;


public class MaximumBitwiseXORAfterRearrangement {
    public static void main(String[] args) {

        String s = "10";
        String t = "11";
        System.out.println(maximumXor(s, t));

    }

    public static String maximumXor(String s, String t) {
        int ones = 0;

        // count 1s in t
        for (char c : t.toCharArray()) {
            if (c == '1') ones++;
        }

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '0' && ones > 0) {
                result.append('1');
                ones--;
            }
            else if (c == '1' && (t.length() - result.length() - ones) > 0) {
                result.append('1');
            }
            else {
                result.append('0');
                if (c == '1') ones--;
            }
        }

        return result.toString();
    }



}
