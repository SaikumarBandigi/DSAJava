package leetcodecontest.biweekly.one84;

public class ExactlyOneConsecutiveSetBitsPair {

    public static void main(String[] args) {

        int nums = 6;
        System.out.println(new ExactlyOneConsecutiveSetBitsPair().consecutiveSetBits(nums));

    }

    public boolean consecutiveSetBits(int n) {


        String input = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '1' && input.charAt(i + 1) == '1') {
                count++;
            }
        }
        return count == 1;
    }


}
