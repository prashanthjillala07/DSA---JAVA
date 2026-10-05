class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num:nums1)
        {
            hMap.put(num,hMap.getOrDefault(num,0)+1);
        }
        for(int num:nums2)
        {
            if(hMap.getOrDefault(num,0)>0)
            {
                 hMap.put(num,hMap.getOrDefault(num,0)-1);
                 result.add(num);
            }
        }
        int[] output = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            output[i]=result.get(i);
        }
        return output;
    }
}