package leetcode.MathTut;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XXVII";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

    private static int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }


}
