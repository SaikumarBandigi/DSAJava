package stringTut;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        // Step 1: length check
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        // Step 2: count characters in s
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // Step 3: subtract using t
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        // Step 4: check all zero
        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
}
