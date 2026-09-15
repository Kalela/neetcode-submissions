class Solution {
    public int search(int[] nums, int target) {
        int pivot = nums.length / 2;
        if (nums.length == 1 && nums[0] != target) {
            return -1;
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target < nums[pivot]) {
            int searchResult = search(Arrays.copyOfRange(nums, 0, pivot), target);
            if (searchResult == -1) {
                return -1;
            }
            return pivot + searchResult;
        }

        if (target > nums[pivot]) {
            int searchResult = search(Arrays.copyOfRange(nums, pivot, nums.length), target);
            if (searchResult == -1) {
                return -1;
            }
            return pivot + searchResult;
        }

        return -1;
        
    }
}
