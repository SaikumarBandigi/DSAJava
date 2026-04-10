package leetcode.stringmatching;

public class BinaryGap {

    public static void main(String[] args) {

        int N = 22;
        System.out.println(new BinaryGap().binaryGap(N));

    }

    public int binaryGap(int N) {
        String binary = Integer.toBinaryString(N); // 10110

        int lastIndex = -1;
        int maxDistance = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (lastIndex != -1) {
                    maxDistance = Math.max(maxDistance, i - lastIndex);
                }
                lastIndex = i;
            }
        }

        return maxDistance;
    }

}
