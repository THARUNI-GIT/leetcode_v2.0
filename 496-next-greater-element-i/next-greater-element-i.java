class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(nums2[0]);
        for(int i = 1; i < nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(),nums2[i]);
            } 
            stack.push(nums2[i]);
        }

        for(int i = 0; i < nums1.length; i++){
            int n = nums1[i];
            if(!map.containsKey(n)){
                arr[i] = -1;
            }
            else {arr[i] = map.get(n);}
        }
        return arr;

    }
}