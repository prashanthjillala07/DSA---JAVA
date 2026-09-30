class Solution {
    public int missingNumber(int[] nums) {
        int missNumber = 0;
        for(int i=0;i<nums.length;i++)
        {
            missNumber =missNumber^nums[i]^i;
        }
        return missNumber^nums.length;
        
    }
}