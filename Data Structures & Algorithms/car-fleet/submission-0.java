class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> fleets = new Stack<>();

        List<int[]> combined = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            combined.add(new int[] {position[i], speed[i]});
        }

        combined.sort((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = combined.size() - 1; i >= 0; i--) {
            int carDistance = target - combined.get(i)[0];
            int carSpeed = combined.get(i)[1];
            double time = (double) carDistance / carSpeed;
            while (fleets.isEmpty() || time > fleets.peek()) {
                fleets.push(time);
            }
            
        }

        return fleets.size();
    }
}
