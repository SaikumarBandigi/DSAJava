package leetcode.arrayconcept;

import java.util.ArrayList;
import java.util.List;

public class ChunkArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getChunkArray(arr, 3));
    }

    static List<List<Integer>> getChunkArray(int[] arr, int size) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i = i + size) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < i + size && j < arr.length; j++) {
                temp.add(arr[j]);
            }
            list.add(temp);
        }
        return list;
    }

}
