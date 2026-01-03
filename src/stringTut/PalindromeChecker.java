package stringTut;

public class PalindromeChecker {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Ab,bA")); // true
        System.out.println(isPalindrome("Hello, World!")); // false

    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        StringBuilder normalizedStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalizedStr.append(Character.toLowerCase(c));
            }
        }

        // Check if the normalized string is a palindrome
        String cleanedStr = normalizedStr.toString();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
