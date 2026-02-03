package leetcode.backtrackingtut;

import java.util.*;

public class Combinations {

    public static void main(String[] args) {
        Combinations obj = new Combinations();
        System.out.println(obj.combine(2, 2));
    }

    public List<List<Integer>> combine(int range, int sizeOfWindow) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(range, sizeOfWindow, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int range, int sizeOfWindow, int start, List<Integer> tempList, List<List<Integer>> result) {

        // BASE CONDITION → only take size k
        if (tempList.size() == sizeOfWindow) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= range; i++) {

            // 1. Choose
            tempList.add(i);

            // 2. Explore
            backtrack(range, sizeOfWindow, i + 1, tempList, result);

            // 3. Undo
            tempList.remove(tempList.size() - 1);
        }
    }

}
