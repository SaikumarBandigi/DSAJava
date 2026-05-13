package leetcode.arrayconcept;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums));

    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // store all numbers into set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            // check starting point of sequence
            if (!set.contains(num - 1)) {   // it checks here ..... previous number exists or not
                int currentNum = num;
                int currentStreak = 1;
                // count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    /*

    for → traverse
    if → filtering/start condition
    while → expansion/continuous process

     */


}
