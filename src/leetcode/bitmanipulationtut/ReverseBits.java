package leetcode.bitmanipulationtut;

public class ReverseBits {
    public static void main(String[] args) {

        int num = 43261596;
        System.out.println(reverseBits(num));
    }

    public static int reverseBits(int n) {

        // Convert to 32-bit binary
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        // Reverse string
        char[] arr = binary.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(arr);

        // Convert binary to decimal
        return Integer.parseInt(reversed, 2);

    }


}
