package practisetut;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {

        int num = 4;
        String res = intToStringRoman(num);

        System.out.println(res);
        System.out.println(romanToInt(res));
    }

    static String intToStringRoman(int num) {
        int[] values = {
                1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };

        // X L C D M


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }
    public static int romanToInt(String s) {

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
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }

}
