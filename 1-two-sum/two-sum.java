import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> tSum = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int required = target - nums[i];
            if(tSum.containsKey(required))
            {
                return new int [] {tSum.get(required),i};
            }
            tSum.put(nums[i],i);
        }
        return new int [] {-1,-1};
    }
}