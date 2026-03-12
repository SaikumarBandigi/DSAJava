package leetcode.stringmatching;

public class MaximumRepeatingSubstring {

    public static void main(String[] args) {

        String sequence = "ababc", word = "ab";
        System.out.println(new MaximumRepeatingSubstring().maxRepeating(sequence, word));

    }

    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String repeated = word;

        while (sequence.contains(repeated)) {
            count++;
            repeated += word;
        }

        return count;
    }

}
