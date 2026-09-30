class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int n=nums.length;
        for(int num:nums)
        {
             hMap.put(num, hMap.getOrDefault(num, 0) + 1);
        }
        int mElement = -1; 
        
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                mElement = entry.getKey();
                return mElement;
                 
            }
        }
        return -1;
    }
}