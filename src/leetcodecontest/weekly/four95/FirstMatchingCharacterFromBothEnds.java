package leetcodecontest.weekly.four95;

public class FirstMatchingCharacterFromBothEnds {

    public static void main(String[] args) {
        String s = "abcacbd";
        System.out.println(new FirstMatchingCharacterFromBothEnds().firstMatchingIndex(s));
    }

    public int firstMatchingIndex(String s) {

        if (s.length() == 1) return 0;

        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                return i;
            }
        }

        return -1;
    }

}
