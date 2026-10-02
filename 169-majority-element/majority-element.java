class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidiate=0;
        for(int num:nums)
        {
            if(count==0)
            {
                candidiate=num;
            }
            if(num==candidiate)
            {
                count++;
            }
            else
            count--;
        }
        return candidiate;
    }
}