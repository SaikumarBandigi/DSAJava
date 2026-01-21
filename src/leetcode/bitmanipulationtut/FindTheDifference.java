package leetcode.bitmanipulationtut;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {

        int xor = 0;

        // XOR all chars in s
        for (char c : s.toCharArray()) {
            xor ^= c;
        }

        // XOR all chars in t
        for (char c : t.toCharArray()) {
            xor ^= c;
        }

        // Remaining value is the extra character
        return (char) xor;

    }

}
