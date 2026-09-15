class Solution {
    public int search(int[] nums, int target) {
        int pivot = nums.length / 2;
        if (nums.length == 1 && nums[0] != target) {
            return -1;
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target > nums[pivot]) {
            return search(Arrays.copyOfRange(nums, 0, pivot), target);
        }

        if (target < nums[pivot]) {
            return search(Arrays.copyOfRange(nums, pivot, nums.length), target);
        }

        return -1;
        
    }
}
