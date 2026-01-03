package assignments;


public class Palindrome {
    public static void main(String[] args) {

        String s = "saas";
        System.out.println(isPali(s));

    }

    private static boolean isPali(String s) {

        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        return res.equals(s);

    }
}
