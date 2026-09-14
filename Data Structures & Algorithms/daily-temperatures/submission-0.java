class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[1]) {
                int location = stack.peek()[0];
                res[location] = i - stack.pop()[0];
            }
            stack.push(new int[] {i, temperatures[i]});
        }

        return res;

    }
}
