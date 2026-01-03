package leetcode.leetcode75.stack;

import java.util.Stack;
import java.util.Arrays;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids1))); // Output: [5, 10]

        int[] asteroids2 = {8, -8};
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); // Output: []

        int[] asteroids3 = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids3))); // Output: [10]
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Process current asteroid
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                // Handle collision
                int top = stack.pop();

                if (Math.abs(top) > Math.abs(asteroid)) {
                    // Top asteroid survives
                    stack.push(top);
                    asteroid = 0; // Current asteroid is destroyed
                    break;
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    // Both asteroids are destroyed
                    asteroid = 0;
                    break;
                }
                // Otherwise, continue popping (top is destroyed)
            }

            if (asteroid != 0) {
                // No collision or asteroid survived, push it to stack
                stack.push(asteroid);
            }

        }

        // Convert stack to result array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

}
