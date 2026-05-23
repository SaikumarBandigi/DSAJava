package leetcode.bitmanipulationtut;

public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(new NumberofStepstoReduceaNumbertoZero().numberOfSteps(num));
        System.out.println(new NumberofStepstoReduceaNumbertoZero().numberOfStepsOptimized(num));
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
        return (num & 1) == 0;
    }

    public int numberOfStepsOptimized(int num) {

        int steps = 0;

        while (num != 0) {
            if (isEven(num)) {
                num = num >> 1;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }

}
