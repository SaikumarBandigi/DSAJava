package stringTut;

public class Printthesumofeverywindowofsize2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i >= k - 1) {
                System.out.println(sum);
                sum -= arr[i - (k - 1)];
            }
        }
    }
}
