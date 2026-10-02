class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int currOnes=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                currOnes++;
            }
            maxOnes = Math.max(maxOnes,currOnes);
            if(nums[i]==0)
            currOnes=0;
        }
        return maxOnes;
        
    }
}