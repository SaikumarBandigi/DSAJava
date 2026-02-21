package twoPointerTut;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // amanaplanacanalpanama
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return isStringPalindrome(sb.toString());
    }

    static boolean isStringPalindrome(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return s.contentEquals(res);
    }


}
