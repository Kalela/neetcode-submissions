class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (Character.isLetterOrDigit(token.charAt(token.length() - 1))) {

                stack.push(Integer.parseInt(token));
            } else {
                for (int i = 0; i < 2; i++) {
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
                        stack.push(y / x);
                        break;
                    } else if (token.equals("-")) {
                        stack.push(y - x);
                        break;
                    }
                }
            }
        }

        return stack.peek();
    }
}
