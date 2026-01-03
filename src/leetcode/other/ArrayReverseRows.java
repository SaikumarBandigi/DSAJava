package leetcode.other;

public class ArrayReverseRows {
    public static void reverseRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length - 1;

            while (left < right) {
                // Swap elements at left and right indices
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;

                // Move the left and right pointers inward
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

//        System.out.println("Original array:");
//        printArray(array);

        reverseRows(array);

        //System.out.println("Array with reversed rows:");
        // replace(array);
        printArray(array);
    }

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println();
    }


    public static void replace(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
            // System.out.println();
        }
    }

}
