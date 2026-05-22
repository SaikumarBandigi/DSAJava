package interviewTut;

public class PalindromeCheck {

    public static void main(String[] args) {

        String s = "madam";
        System.out.println(new PalindromeCheck().ispalindrome(s));
    }

    boolean ispalindrome(String s) {
        String res = rev(s);
        return s.equals(res);
    }

    String rev(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
