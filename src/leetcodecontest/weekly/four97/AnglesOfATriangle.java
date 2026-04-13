package leetcodecontest.weekly.four97;

import java.util.Arrays;

public class AnglesOfATriangle {

    public static void main(String[] args) {

        int[] sides = {3, 4, 5};
        System.out.println(Arrays.toString(new AnglesOfATriangle().internalAngles(sides)));

    }

    public double[] internalAngles(int[] sides) {
        double a = sides[0], b = sides[1], c = sides[2];

        if (a + b <= c || b + c <= a || a + c <= b) {
            return new double[0];
        }

        double angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        double[] result = new double[]{angleA, angleB, angleC};
        Arrays.sort(result);

        return result;
    }

}
