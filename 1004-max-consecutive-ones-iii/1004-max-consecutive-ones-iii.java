class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute version
        int count_Zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count_Zero++;
        }
        if(count_Zero <= k){
            return nums.length;
        }
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            int j = i;
            int window_length = 0;
            while(j < nums.length){
                if(nums[j] == 0) count++;
                if(count > k) break;
                j++;
                window_length++;
            }
            max = Math.max(max,window_length);
        }
        return max;
    }
}