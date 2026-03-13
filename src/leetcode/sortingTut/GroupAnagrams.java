package leetcode.sortingTut;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate"};
        List<List<String>> res = new GroupAnagrams().groupAnagrams(strs);

        for (List<String> list : res) {
            System.out.println(list);
        }

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }

    boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

}
