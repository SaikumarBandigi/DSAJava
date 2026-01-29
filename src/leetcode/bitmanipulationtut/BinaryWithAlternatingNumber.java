package leetcode.bitmanipulationtut;

public class BinaryWithAlternatingNumber {
    public static void main(String[] args) {

        int num = 5; // 101 -> True
        System.out.println(hasAlternatingBits(num));
    }

    public static boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == binary.charAt(i - 1))
                return false;
        }
        return true;
    }

}
