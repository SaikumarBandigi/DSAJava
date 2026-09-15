package leetcode.HashMapTut;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"sai", "ias"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();


        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray); // ais
            String key = new String(charArray);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }

}
