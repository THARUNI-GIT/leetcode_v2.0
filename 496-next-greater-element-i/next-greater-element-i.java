class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            int pt = i;
            while(pt < nums2.length){
                if(nums2[pt] > nums2[i]){
                    map.put(nums2[i],nums2[pt]);
                    break;
                }
                pt++;
            }
            if(!map.containsKey(nums2[i])){
                map.put(nums2[i],-1);
            }
        }
        for(int i = 0; i < nums1.length; i++){
            int n = nums1[i];
            arr[i] = map.get(n);
        }
        return arr;

    }
}