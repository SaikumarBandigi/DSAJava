package assignments._3_conditional_loops;

import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (isVowel(c)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
    private static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
