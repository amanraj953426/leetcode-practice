class Solution {
    public boolean isValid(String s) {

        Stack<Character> myStack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket == '{') {
                myStack.push(bracket);
            } else if(
                !myStack.isEmpty() &&
                (
                    (bracket == ')' && myStack.peek() == '(') ||
                    (bracket == ']' && myStack.peek() == '[') ||
                    (bracket == '}' && myStack.peek() == '{')
                )
            ) {
                myStack.pop();
            } else {
                return false;
            }
        }

        if(myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}