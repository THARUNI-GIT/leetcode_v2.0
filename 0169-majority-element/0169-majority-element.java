class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > maj) {
                return nums[i];
            }
        }

        return -1;
    }
}