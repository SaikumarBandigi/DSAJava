package Lectures.arraysandarraylist;

public class D2ArrayInfo {
    public static void main(String[] args) {

//        int[][] arr = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


//        int a[][] = new int[2][];
//
//        a[0] = new int[1];
//        a[1] = new int[2];


        int a[][] = {{1, 2, 3}, {10, 11}};


//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = i + j;
//            }
//        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
