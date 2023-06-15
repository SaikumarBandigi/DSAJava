package Lectures._linear_search_algorithm;


public class practise {
    public static void main(String[] args) {

        int[] a = {1, 22, 333, 4444, 55555, 666666, 7777777, 999999999};

        int answer = find(a);
        System.out.println(answer);
    }

    static int find(int[] a) {
        int count = 0;

        for (int i : a) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int a) {

        int answer = check(a);

        if (answer % 2 == 0) {
            return true;
        }
        return false;
    }

    static int check(int a) {
        int count = 0;

        while (a > 0) {
            count++;
            a = a / 10;
        }
        return count;
    }


}
