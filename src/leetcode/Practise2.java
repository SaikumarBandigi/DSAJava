package leetcode;

public class Practise2 {
    static void Reverse(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int start = 0;
            int end = array[i].length - 1;

            while (start < end) {
                int temp = array[i][start];
                array[i][start] = array[i][end];
                array[i][end] = temp;
                start++;
                end--;
            }
        }

    }

    static void change(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
            //System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = {
                {1, 0, 1, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        Reverse(array);
        change(array);
        printArray(array);
    }

    static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
