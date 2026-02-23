package leetcodecontest.biweekly.one76;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPrefixConnectedGroups {
    public static void main(String[] args) {
        String[] words = {"car", "cat", "cartoon"};
        int k = 3;
        System.out.println(new NumberOfPrefixConnectedGroups().prefixConnected(words, k));
    }

    public int prefixConnected(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        int groups = 0;

        for (String word : words) {

            if (word.length() < k) {
                continue;
            }

            String prefix = word.substring(0, k);

            int newCount = map.getOrDefault(prefix, 0) + 1;
            map.put(prefix, newCount);
            if (newCount == 2) {
                groups++;
            }
        }
        return groups;
    }

}
