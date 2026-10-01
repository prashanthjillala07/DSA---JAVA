class Solution {
    public int removeDuplicates(int[] nums) {
        int read=0;
        int write=0;
        while(read<nums.length)
        {
            if(nums[write]!=nums[read])
            {
                write++;
                nums[write]=nums[read];
            }
            read++;
        }
        return ++write;
        
    }
}