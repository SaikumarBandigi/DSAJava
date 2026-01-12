package leetcode.arrayconcept;

public class Example {
    public static void main(String[] args) {

        int sum = 0;
        int n = 1_00_000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
