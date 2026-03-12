package leetcode.HeapPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 10};
        System.out.println(new leetcode.arrayconcept.MaximumProductofTwoElementsinanArray().maxProduct(arr));
        System.out.println(new leetcode.arrayconcept.MaximumProductofTwoElementsinanArray().maxProductUsingHeap(arr));
    }

    public int maxProduct(int[] nums) {

        int maxProduct = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int presentMax = (nums[i] - 1) * (nums[j] - 1);
                if (presentMax > maxProduct) {
                    maxProduct = presentMax;
                }
            }
        }
        return maxProduct;
    }

    public int maxProductUsingHeap(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : nums) {
            pq.add(n);
        }

        int a = pq.poll();
        int b = pq.poll();

        return (a - 1) * (b - 1);
    }

}
