class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(seen.containsKey(temp)) {
                res[0] = seen.get(temp);
                res[1] = i;
                return res;
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}
