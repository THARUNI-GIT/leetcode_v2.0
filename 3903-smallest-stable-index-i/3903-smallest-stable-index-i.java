class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            int diff = findMax(nums,i) - findMin(nums,i);
            if(diff <= k){
                return i;
            }
        }
        return -1;
    }

    public int findMax(int[] arr, int i){
        int max = Integer.MIN_VALUE;
        for(int j = 0; j <= i; j++){
            max = Math.max(max,arr[j]);
        }
        return max;
    }

    public int findMin(int[] arr, int i){
        int min = Integer.MAX_VALUE;
        for(int j = i; j < arr.length; j++){
            min = Math.min(min,arr[j]);
        }
        return min;
    }
}