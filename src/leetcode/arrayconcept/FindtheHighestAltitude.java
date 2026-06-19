package leetcode.arrayconcept;

public class FindtheHighestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(new FindtheHighestAltitude().largestAltitude(gain));
    }

    public int largestAltitude(int[] gain) {

        int altitude = 0;
        int maxAltitude = 0;

        for (int i : gain) {
            altitude += i;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }

}
