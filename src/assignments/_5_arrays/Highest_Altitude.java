package assignments._5_arrays;

public class Highest_Altitude {
    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int res=largestAltitude(gain);
        System.out.println(res);

    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {

            sum += gain[i];
            // sum=sum+gain[i];

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

