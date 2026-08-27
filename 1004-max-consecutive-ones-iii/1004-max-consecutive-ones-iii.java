class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zeroes = 0;
        int max = 0;
        while( r < nums.length){
            if(nums[r] == 0) zeroes++;
           
            while(zeroes > k){
                if(nums[l] == 0) zeroes--;
                l++;
            }
             
            r++;
            max = Math.max(max,r-l);
        }
        return max;
    }
}