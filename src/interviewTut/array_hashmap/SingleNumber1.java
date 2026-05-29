package interviewTut.array_hashmap;

public class SingleNumber1 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};
        System.out.println(new SingleNumber1().getThatSingleNumber(arr));
    }

    int getThatSingleNumber(int[] arr) {

        int res = 0;
        for (int num : arr) {
            res = res ^ num;
        }
        return res;
    }

}
