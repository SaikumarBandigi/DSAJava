package interviewBit;

public class TrailingZeroes {

    public static void main(String[] args) {
        int A = 18;

        System.out.println(new TrailingZeroes().solve(A));
    }

    public int solve(int A) {
        String ABinaryString = Integer.toBinaryString(A); // 10010
        int count = 0;
        for (int i = ABinaryString.length() - 1; i >= 0; i--) {
            if (ABinaryString.charAt(i) - '0' == 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
