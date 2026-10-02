class Solution {
    public int missingNumber(int[] nums) {
        int missNum=0;
        for(int i=0;i<nums.length;i++)
        {
            missNum=missNum^nums[i]^i;
        }
        return missNum^nums.length;
        
    }
}