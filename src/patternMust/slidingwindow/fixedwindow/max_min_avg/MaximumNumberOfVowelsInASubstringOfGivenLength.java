package patternMust.slidingwindow.fixedwindow.max_min_avg;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "eeetcode";
        int k = 3;
        System.out.println(new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

    public int maxVowels(String s, int k) {
        // 1️⃣ First window
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxVowels = count;

        // 2️⃣ Sliding window
        for (int right = k; right < s.length(); right++) {

            // add right
            if (isVowel(s.charAt(right))) {
                count++;
            }

            // remove left
            int left = right - k;
            if (isVowel(s.charAt(left))) {
                count--;
            }

            maxVowels = Math.max(maxVowels, count);
        }

        return maxVowels;
    }


    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

}
