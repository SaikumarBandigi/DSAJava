package leetcode.slidingwindowTut;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        String s = "CM";
        System.out.println(stringToInt(s));

        int num = 99;
        System.out.println(intToString(num));

    }

    static int stringToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (i < s.length() - 1 && curr < map.get(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }

    static String intToString(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                res.append(symbols[i]);
                num -= values[i];
            }

        }
        return res.toString();
    }


}
