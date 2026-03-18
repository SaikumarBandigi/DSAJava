package leetcode.bitmanipulationtut;

public class HammingDistance {

    public static void main(String[] args) {

        int x = 1;
        int y = 4;

        System.out.println(new HammingDistance().hammingDistance(x, y));


    }

    public int hammingDistance(int x, int y) {

        String xBinary = Integer.toBinaryString(x);
        String yBinary = Integer.toBinaryString(y);

        String xValue = String.format("%32s", xBinary).replace(' ', '0');
        String yValue = String.format("%32s", yBinary).replace(' ', '0');

        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (xValue.charAt(i) != yValue.charAt(i)) {
                count++;
            }
        }
        return count;
    }

}
