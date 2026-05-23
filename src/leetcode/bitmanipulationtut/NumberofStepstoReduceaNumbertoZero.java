package leetcode.bitmanipulationtut;

public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(new NumberofStepstoReduceaNumbertoZero().numberOfSteps(num));
    }

    public int numberOfSteps(int num) {

        int step = 0;

        while (num != 0) {
            if (isEven(num)) {
                num /= 2;
            } else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }

    boolean isEven(int num) {
        return (num % 2) == 0;
    }

}
