package leetcode.HashTableConcept;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        String s = "apple";
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "app", "le");
        System.out.println(new WordBreak().wordBreak(s, list));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true; // base case

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
