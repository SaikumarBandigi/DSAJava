package stanley.stringTut;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "Sa1aS";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (isAlphanumeric(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return isPali(sb.toString());
    }

    boolean isPali(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }

    boolean isAlphanumeric(char ch) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".indexOf(ch) != -1;
    }

}
