package interviewTut.array_hashmap;

import java.util.HashMap;

public class FindFrequency {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 1, 2, 3};
        new FindFrequency().getFrequency(ar);
    }

    void getFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }

}
