class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> stack1 = new Stack<Character>();
       Stack<Character> stack2 = new Stack<Character>();
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(!stack1.isEmpty() && ch == '#'){
            stack1.pop();
        }
        else if(ch != '#'){
            stack1.push(ch);
        }
       }
        for(int i = 0; i < t.length(); i++){
        char ch = t.charAt(i);
        if(!stack2.isEmpty() && ch == '#'){
            stack2.pop();
        }
        else if(ch != '#'){
            stack2.push(ch);
        }
       }

       if(stack1.isEmpty() && stack2.isEmpty()){
        return true;
       }

       else if(stack1.size() != stack2.size()){
        return false;
       }

       else{
        for(int i = stack1.size()-1; i >= 0; i--){
            if(stack1.get(i) != stack2.get(i)){
                return false;
            }
        }
       }
       return true;

    }
}