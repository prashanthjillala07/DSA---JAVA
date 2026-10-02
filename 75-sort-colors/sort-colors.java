class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            int temp;
            if(nums[mid]==0)
            {
                temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
            else 
            mid++;
        }
        
    }
}