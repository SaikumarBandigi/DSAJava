package leetcode.bitmanipulationtut;

public class AddBinary {
    public static void main(String[] args) {
        String a = "0";
        String b = "0";

        System.out.println(addBinary(a, b));
    }


    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';   // convert '0'/'1' to 0/1
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // current bit
            result.append(sum % 2);

            // carry
            carry = sum / 2;
        }

        return result.reverse().toString();

    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';   // '0' or '1' → 0 or 1
            decimal = decimal + bit * (int) Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    static String DecimalToBinary(int num) {

        String binary = "";

        while (num > 0) {
            int rem = num % 2;        // remainder (0 or 1)
            binary = rem + binary;   // add in front
            num = num / 2;
        }
        return binary;
    }


}
