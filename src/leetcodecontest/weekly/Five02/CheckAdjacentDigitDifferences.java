package leetcodecontest.weekly.Five02;

public class CheckAdjacentDigitDifferences {

    public static void main(String[] args) {

        String s = "132";
        System.out.println(new CheckAdjacentDigitDifferences().isAdjacentDiffAtMostTwo(s));
    }

    public boolean isAdjacentDiffAtMostTwo(String s) {

        int atMost = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int abs = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if (abs > atMost) {
                atMost = abs;
            }
        }
        return atMost <= 2;
    }

}
