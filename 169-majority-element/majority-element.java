class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidiate = -1;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(count == 0)
            {
                candidiate = nums[i];  
            }
            if(nums[i]==candidiate)
            {
                count++;
            }
            else
            count--;
        }
        return candidiate;
        
    }
}