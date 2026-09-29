import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (twoSum.containsKey(required)) {
                return new int[]{twoSum.get(required), i};
            } else {
                twoSum.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}