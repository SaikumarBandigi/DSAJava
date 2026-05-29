package interviewTut.stringTut;

public class AnagramCheck {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        System.out.println(new AnagramCheck().check(s1, s2));
    }

    boolean check(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

}
