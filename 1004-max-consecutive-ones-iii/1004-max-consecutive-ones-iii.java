class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        int count = 0;
        for(int i = 1; i < n+1; i++){
            if(nums[i-1] == 0){
                count++;
            }
            prefix[i] = count;
        }
        int left = 0, right = 0;
        int max = 0;
        while(right < n){
            while(prefix[right+1]-prefix[left] > k){
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
return max;
    }
}