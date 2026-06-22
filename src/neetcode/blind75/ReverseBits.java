package neetcode.blind75;

public class ReverseBits {

    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(new ReverseBits().reverseBits(n));
    }

    public int reverseBits(int n) {

        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        char[] chars = binary.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String rev = new String(chars);

        long decAnswer = Long.parseLong(rev, 2);
        return (int) decAnswer;
    }

}
