class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num1 : nums1) {
            hMap.put(num1, hMap.getOrDefault(num1, 0) + 1);
        }

        for (int num2 : nums2) {
            if (hMap.getOrDefault(num2, 0) > 0) {
                result.add(num2);
                hMap.put(num2, hMap.getOrDefault(num2, 0) - 1);
            }
        }

        int[] array = result.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        return array;
    }
}