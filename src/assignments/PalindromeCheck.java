package assignments;

public class PalindromeCheck {
    public static void main(String[] args) {

        String input = "sas";
        if (isPalindrome(input)) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }

    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Convert to lowercase and remove non-alphanumeric characters
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
