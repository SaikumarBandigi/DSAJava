package leetcodecontest.weekly.five05;

import java.util.ArrayList;
import java.util.List;

public class ValidBinaryStringsWithCostLimit {

    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        System.out.println(new ValidBinaryStringsWithCostLimit().generateValidStrings(n, k));

    }

    public List<String> generateValidStrings(int n, int k) {

        List<String> res = new ArrayList<>();

        List<String> binaryStrings = getBinaryStringsAccordtingToLength(n);

        List<String> binaryStringsWithoutConsecutive1s = binaryStringsWithoutConsecutive1(binaryStrings);


        for (String s : binaryStringsWithoutConsecutive1s) {

            int cost = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    cost += i;
                }
            }

            if (cost <= k) {
                res.add(s);
            }
        }

        return res;
    }

    List<String> getBinaryStringsAccordtingToLength(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }

    private static void generate(String current, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generate(current + "0", n, result);
        generate(current + "1", n, result);
    }

    List<String> binaryStringsWithoutConsecutive1(List<String> bs) {
        List<String> result = new ArrayList<>();

        for (String s : bs) {
            if (!s.contains("11")) {
                result.add(s);
            }
        }

        return result;
    }


}
