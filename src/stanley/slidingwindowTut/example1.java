package stanley.slidingwindowTut;

public class example1 {
    public static void main(String[] args) {

        //0  1  2
        int arr[] = {2, 6, 8};
        int k = 2;
        int n = arr.length;


        int sum = 0;  //
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int max = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i]; //
            sum = sum - arr[i - k];

            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
