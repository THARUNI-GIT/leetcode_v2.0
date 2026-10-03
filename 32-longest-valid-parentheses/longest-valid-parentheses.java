import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        // Handle empty or null strings directly
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<>();
        // Push -1 as a base index to handle edge cases where valid substrings start at index 0
        stack.push(-1); 
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                // Store the index of the opening parenthesis
                stack.push(i);
            } else {
                // Pop the top index for a matching closing parenthesis
                stack.pop();
                
                if (stack.isEmpty()) {
                    // If empty, the current index becomes the new boundary base
                    stack.push(i);
                } else {
                    // Calculate the length of the current valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
