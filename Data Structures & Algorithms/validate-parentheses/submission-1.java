class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if(closeToOpen.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() != closeToOpen.get(c)) {
                    return false;
                }
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
