class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (Character.isLetterOrDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                while(!stack.isEmpty()) {
                    int x = stack.peek();
                    stack.pop(); 
                    int y = stack.peek();
                    stack.pop(); 
                    if (token.equals("+")) {
                        stack.push(x + y);
                        break;
                    } else if (token.equals("*")) {
                        stack.push(x * y);
                        break;
                    } else if (token.equals("/")) {
                        stack.push(x / y);
                        break;
                    } else if (token.equals("-")) {
                        stack.push(x - y);
                        break;
                    }
                }
            }
        }

        return stack.peek();
    }
}
