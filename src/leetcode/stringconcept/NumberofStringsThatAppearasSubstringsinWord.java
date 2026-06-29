package leetcode.stringconcept;

public class NumberofStringsThatAppearasSubstringsinWord {

    public static void main(String[] args) {

        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";

        System.out.println(new NumberofStringsThatAppearasSubstringsinWord().numOfStrings(patterns, word));
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (isSubString(pattern, word)) {
                count++;
            }
        }
        return count;
    }

    boolean isSubString(String pattern, String word) {
        return word.contains(pattern);
    }

}
