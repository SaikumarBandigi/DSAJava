package leetcode.stringconcept;

public class MaximumProductofWordLengths {

    public static void main(String[] args) {

        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(new MaximumProductofWordLengths().maxProduct(words));

    }

    public int maxProduct(String[] words) {

        int maxProduct = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (!hasCommonCharacter(words[i], words[j])) {
                    int product = words[i].length() * words[j].length();
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }

    private boolean hasCommonCharacter(String a, String b) {
        boolean[] present = new boolean[26];

        for (char ch : a.toCharArray()) {
            present[ch - 'a'] = true;
        }

        for (char ch : b.toCharArray()) {
            if (present[ch - 'a']) {
                return true;
            }
        }

        return false;
    }

}
