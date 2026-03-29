package interviewBit;

public class CountTotalSetBits {
    public static void main(String[] args) {

        int A = 3;
        System.out.println(new CountTotalSetBits().countTotalSetBitsTLE(A));

/*
1 001
2 010
3 011

 */
    }

    int countTotalSetBitsTLE(int A) {

        int count = 0;
        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < 32; j++) {
                if (isSetBit(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    boolean isSetBit(int num, int pos) {
        return ((num >> pos) & 1) == 1;
    }

}
