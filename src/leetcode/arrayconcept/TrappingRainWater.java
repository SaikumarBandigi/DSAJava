package leetcode.arrayconcept;

public class TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(new TrappingRainWater().TrapWater(height));
    }

    public int TrapWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int trapped = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trapped += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trapped += rightMax - height[right];
            }
        }
        return trapped;
    }

}
