package Lectures.arraysandarraylist;

public class MaxNumberInArray {
    public static void main(String[] args) {

        int a[] = {1,5,4,2};

        System.out.println(MaxNumber(a));
    }

    private static int MaxNumber(int[] a) {
        int init = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > init) {
                init = a[i];
            }
        }
        return init;


    }
}
