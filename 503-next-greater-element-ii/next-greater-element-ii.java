class Solution {
    public int[] nextGreaterElements(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        int n = nums.length;

        for(int i = 1; i < n; i++){
            int m = nums[i];
            while(!stack.isEmpty() && m > nums[stack.peek()]){
                map.put(stack.pop(),m);
            }
            stack.push(i);
        }

        for(int i = 0; i < n; i++){
            int m = nums[i];
            while(!stack.isEmpty() && m > nums[stack.peek()]){
                map.put(stack.pop(),m);
            }
        }

        for(int i = 0; i < n; i++){
            if(!map.containsKey(i)){
                map.put(i,-1);
            }
        }

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = map.get(i);
        }
        
        return arr;
            }
}