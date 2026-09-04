class Solution {
    public boolean uniformArray(int[] nums1) {
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for(int i : nums1){
            if(i % 2 == 0){
                minEven = Math.min(i,minEven);
            }
            else{
                minOdd = Math.min(i,minOdd);
            }
        }
        if(minEven == Integer.MAX_VALUE || minOdd == Integer.MAX_VALUE){
            return true;
        }
        return minOdd < minEven;
        
    }
}