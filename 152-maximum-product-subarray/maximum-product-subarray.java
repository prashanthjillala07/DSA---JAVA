class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxPro = nums[0];
        int minPro = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int oldMax = maxPro;
            int oldMin = minPro;

            maxPro = Math.max(num, Math.max(num * oldMax, num * oldMin));
            minPro = Math.min(num, Math.min(num * oldMax, num * oldMin));

            result = Math.max(result, maxPro);
        }

        return result;
    }
}