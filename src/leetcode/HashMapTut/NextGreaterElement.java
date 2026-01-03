package leetcode.HashMapTut;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        NextGreaterElement greaterElement = new NextGreaterElement();
        System.out.println(Arrays.toString(greaterElement.nextGreaterElement(nums1, nums2)));

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {//  4 1 2     //  1 3 4 2
        // Create a map to store number -> next greater element
        Map<Integer, Integer> map = new HashMap<>();
        // Create a stack to maintain decreasing sequence
        Stack<Integer> stack = new Stack<>();

        // Process nums2 from left to right
        for (int num : nums2) {
            // While stack is not empty and current number is greater than top of stack
            while (!stack.isEmpty() && num > stack.peek()) {
                // Pop the element and map it to current number as its next greater element
                map.put(stack.pop(), num);
            }
            // Push current number to stack
            stack.push(num);
        }

        // Any remaining elements in stack have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Create result array for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

}
