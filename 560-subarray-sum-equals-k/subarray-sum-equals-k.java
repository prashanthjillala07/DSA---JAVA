class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hMap = new HashMap <>();
        hMap.put(0,1);
        int prefixSum = 0;
        int count=0;
        for(int num:nums)
        {
            prefixSum+=num;
            int required = prefixSum-k;
            if(hMap.containsKey(required))
            {
                count+=hMap.get(required);
            }
            hMap.put(prefixSum,hMap.getOrDefault(prefixSum, 0) + 1);
        } 
        return count;
    }
}