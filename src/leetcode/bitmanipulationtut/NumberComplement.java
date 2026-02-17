package leetcode.bitmanipulationtut;

public class NumberComplement {
    public static void main(String[] args) {

        System.out.println(findComplement(5)); // 101 -> 010
        System.out.println(findComplementWithString(5));

    }

    public static int findComplement(int num) {
        int mask = 0;
        int temp = num;

        // Create mask with all 1s
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return num ^ mask;
    }

    static int findComplementWithString(int num) {

        String binary = Integer.toBinaryString(num); // 101

        StringBuilder flipped = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char present = binary.charAt(i);

            if (present == '1') {
                flipped.append(0);
            } else if (present == '0') {
                flipped.append(1);
            }
        }
        return Integer.parseInt(flipped.toString(), 2);
    }

}
