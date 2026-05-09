package leetcodecontest.biweekly.one82;

import java.util.Arrays;

public class ScoreValidator {

    public static void main(String[] args) {

        String[] events = {"1", "4", "W", "6", "WD"};
        System.out.println(Arrays.toString(new ScoreValidator().scoreValidator(events)));
    }

    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for (String event : events) {

            // Stop if counter becomes 10
            if (counter == 10) {
                break;
            }

            switch (event) {

                case "W":
                    counter++;
                    break;

                case "WD":
                case "NB":
                    score += 1;
                    break;

                default:
                    // Handles "0", "1", "2", "3", "4", "6"
                    score += Integer.parseInt(event);
            }
        }

        return new int[]{score, counter};
    }

}
