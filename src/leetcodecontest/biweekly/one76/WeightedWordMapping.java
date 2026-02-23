package leetcodecontest.biweekly.one76;


public class WeightedWordMapping {
    public static void main(String[] args) {

        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};
        System.out.println(new WeightedWordMapping().mapWordWeights(words, weights));
    }

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }
            int mod = sum % 26;
            // Reverse alphabetical mapping
            char mappedChar = (char) ('z' - mod);

            sb.append(mappedChar);
        }
        return sb.toString();
    }


}
