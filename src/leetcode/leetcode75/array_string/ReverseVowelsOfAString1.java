package leetcode.leetcode75.array_string;

public class ReverseVowelsOfAString1 {
    public static void main(String[] args) {
        String s = "IceCreAm"; // Expected output: "AceCreIm"
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        // Convert the string to a character array for in-place modification
        char[] chars = s.toCharArray();

        // Two-pointer approach to swap vowels
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move the right pointer to the previous vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move both pointers inward
                left++;
                right--;
            }
        }

        // Convert the character array back to a string
        return new String(chars);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
