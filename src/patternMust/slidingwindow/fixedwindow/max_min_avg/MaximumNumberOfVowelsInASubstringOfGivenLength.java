package patternMust.slidingwindow.fixedwindow.max_min_avg;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "zzaaeee";
        int k = 3;
        System.out.println(new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels(s, k));
    }

    public int maxVowels(String s, int k) {
        int currentVowels = 0;
        int maxVowels = 0;
        int n = s.length();

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }


    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

}
