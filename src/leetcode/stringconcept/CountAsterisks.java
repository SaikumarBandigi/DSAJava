package leetcode.stringconcept;

public class CountAsterisks {
    public static void main(String[] args) {

    }
    public int countAsterisks(String s) {

        String[] words = s.split("\\|");

        int n = words.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                char[] charArray = words[i].toCharArray();
                for (char ch : charArray) {
                    if (ch == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
