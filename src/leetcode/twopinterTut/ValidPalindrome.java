package leetcode.twopinterTut;

public class ValidPalindrome {
    static void main() {

        String s = "raceacar";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return CheckPalindrome(sb.toString());
    }

    static boolean CheckPalindrome(String s) { // amanaplanacanalpanama

        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString().equals(s);
    }

}
