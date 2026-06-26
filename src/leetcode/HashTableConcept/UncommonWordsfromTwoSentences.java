package leetcode.HashTableConcept;

import java.util.*;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class UncommonWordsfromTwoSentences {

    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(new UncommonWordsfromTwoSentences().uncommonFromSentences(s1, s2)));

    }

    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> count = new HashMap();

        for (String word : s1.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);

        for (String word : s2.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);

        List<String> ans = new LinkedList();

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (count.get(key) == 1)
                ans.add(key);
        }

        String[] sArr = new String[ans.size()];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = ans.get(i);
        }

        return sArr;
    }


}
