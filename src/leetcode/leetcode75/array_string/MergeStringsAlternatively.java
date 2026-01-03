package leetcode.leetcode75.array_string;

public class MergeStringsAlternatively {
    public static void main(String[] args) {

        String word1 = "abc", word2 = "z";
        MergeStringsAlternatively mergeStringsAlternatively = new MergeStringsAlternatively();
        System.out.println(mergeStringsAlternatively.mergeAlternately(word1, word2)); // apbqcr
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            stringBuilder.append(word1.charAt(i++));
            stringBuilder.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            stringBuilder.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            stringBuilder.append(word2.charAt(j++));
        }
        return stringBuilder.toString();
    }

}
