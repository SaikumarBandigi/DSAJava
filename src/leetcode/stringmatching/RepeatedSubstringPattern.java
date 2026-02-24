package leetcode.stringmatching;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {

        String s = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            // substring length must divide full length
            if (n % len == 0) {
                String sub = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                int repeat = n / len;
                for (int i = 0; i < repeat; i++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;

    }

}
