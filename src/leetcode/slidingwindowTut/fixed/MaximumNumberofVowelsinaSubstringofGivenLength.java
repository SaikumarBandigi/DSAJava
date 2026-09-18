package leetcode.slidingwindowTut.fixed;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println(new MaximumNumberofVowelsinaSubstringofGivenLength().maxVowels(s, k));

    }

    public int maxVowels(String s, int k) {

        int cSum = 0;
        for (int i = 0; i < k; i++) {
            cSum += isVowel(s.charAt(i)) ? 1 : 0;
        }

        int mSum = cSum;

        for (int right = k; right < s.length(); right++) {
            cSum += isVowel(s.charAt(right)) ? 1 : 0;
            cSum -= isVowel(s.charAt(right - k)) ? 1 : 0;
            if (cSum > mSum) {
                mSum = cSum;
            }
        }
        return mSum;
    }

    boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

}

