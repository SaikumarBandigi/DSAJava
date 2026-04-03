package leetcode.arrayconcept;

import java.util.ArrayList;
import java.util.List;

public class AverageValueofEvenNumbersThatAreDivisiblebyThree {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 12, 15};
        System.out.println(new AverageValueofEvenNumbersThatAreDivisiblebyThree().averageValue(nums));
    }

    public int averageValue(int[] nums) {

        List<Integer> evenAndDivisibleBy3 = new ArrayList<>();

        for (int num : nums) {
            if (isEvenAndDivisibleBy3(num)) {
                evenAndDivisibleBy3.add(num);
            }
        }

        return (int) findAverage(evenAndDivisibleBy3);
    }

    boolean isEvenAndDivisibleBy3(int num) {
        return (num & 1) == 0 && (num % 3 == 0);
    }


    double findAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;

        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }

}

