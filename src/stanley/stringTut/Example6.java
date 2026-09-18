package stanley.stringTut;

public class Example6 {

    public static void main(String[] args) {

        String s = "S,S";
        System.out.println(new Example6().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (isAplhaNumeric(ch)) {
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


    boolean isAplhaNumeric(char ch) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".indexOf(ch) != -1;
    }

}
