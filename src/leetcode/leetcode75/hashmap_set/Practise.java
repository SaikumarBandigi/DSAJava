package leetcode.leetcode75.hashmap_set;

import java.util.*;

// HashMap - in anyway
// TreeMap - in ascending
// LinkedHashMap - in order

// 65 - 90  -> A - Z
// 97 - 122  -> a - z


public class Practise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(convertArrayToString(arr));
    }

    private static String convertArrayToString(int[] array) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
