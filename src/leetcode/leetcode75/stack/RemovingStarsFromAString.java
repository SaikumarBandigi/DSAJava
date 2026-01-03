package leetcode.leetcode75.stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "leet**Co*e";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {

        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

}
