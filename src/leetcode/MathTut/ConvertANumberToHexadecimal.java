package leetcode.MathTut;

public class ConvertANumberToHexadecimal {

    public static void main(String[] args) {
        int num = 26;
        System.out.println(new ConvertANumberToHexadecimal().toHex(num));
    }

    public String toHex(int num) {

        if (num == 0) return "0";

        char[] hexMap = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        // process at most 8 times (32 bits / 4 bits)
        while (num != 0) {
            int digit = num & 15;   // get last 4 bits
            result.append(hexMap[digit]);
            num >>>= 4;             // unsigned right shift
        }

        return result.reverse().toString();
    }

}
