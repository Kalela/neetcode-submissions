class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int pivot = l + ((r - l) / 2);
            if (nums[pivot] == target) {
                return pivot;
            }
            if (nums[pivot] < target) {
                l = pivot + 1;
            }
            if (nums[pivot] > target) {
                r = pivot - 1;
            }
        }

        return -1; 
    }
}
