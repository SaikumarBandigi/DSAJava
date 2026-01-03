package Lectures.liner_search;

public class FindEl {
    public static void main(String[] args) {
        int[] a = {2, 67, 1, 3, 4, 78};

        int target = 78;

        int s = 1;
        int e = 5;

        System.out.println(findEL(a, target, s, e));
        System.out.println(findEL(a, target));
        System.out.println(findMax(a));
        System.out.println(findMin(a));

    }

    private static int findEL(int[] a, int target, int s, int e) {

        for (int i = s; i <= e; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /////////////////////////
    private static int findEL(int[] a, int target) {

        for (int i = 0; i <= a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
    ///////////////////////

    static int findMax(int[] a) {
        int min = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > min) {
                min = j;
            }
        }
        return min;
    }
    //////////////////

    static int findMin(int[] a) {
        int max = Integer.MAX_VALUE;
        for (int j : a) {
            if (j < max) {
                max = j;
            }
        }
        return max;
    }


}
