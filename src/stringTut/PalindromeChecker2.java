package stringTut;

public class PalindromeChecker2 {
    public static void main(String[] args) {

        String input = "saas";
        String cleanedString = removeOtherThings(input);
        boolean result = isPalindromeChecker(cleanedString);
        System.out.println(result);
    }

    private static String removeOtherThings(String input) {

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isPalindromeChecker(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
