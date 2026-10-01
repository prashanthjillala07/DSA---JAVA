class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        int count = 0;
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++)
        {
            if(temp[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}