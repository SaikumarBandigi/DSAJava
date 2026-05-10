package apple;

class Solution {
    public int firstUniqueEven(int[] nums) {
        int res = -1;
        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (isEven(num)) {
                if (map.get(num) == 1) {
                    res = num;
                    break;
                }
            }
        }
        return res;
    }

    boolean isEven(int num) {
        return (num & 1) == 0;
    }
}
