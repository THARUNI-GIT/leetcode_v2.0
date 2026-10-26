class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(stack.peek() == ch){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = stack.size()-1; i >= 0; i--){
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}