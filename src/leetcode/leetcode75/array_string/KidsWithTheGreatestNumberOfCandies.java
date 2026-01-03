package leetcode.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3}; // 5 6 8 4 6
        int extraCandies = 3;
        System.out.println(new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxcandy = 0; // 5

        for (int candy : candies) {
            if (candy > maxcandy ) {
                maxcandy = candy;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
        }

        List<Boolean> booleanList = new ArrayList<>();
        for (int candy : candies) {
            if (candy > maxcandy || candy == maxcandy) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }

}
