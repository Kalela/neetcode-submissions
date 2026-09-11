class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = Math.abs(nums[i]);
            int left = i + 1, right = nums.length - 1;
            
            while (left < right) {
                if ((left < right) && (nums[left] + nums[right] == target)) {
                    sums.add(List.of(nums[i], nums[left], nums[right]));
                }
                if(nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return sums;
    }
}
