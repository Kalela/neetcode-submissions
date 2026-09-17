class Solution {
    public int search(int[] nums, int target) {
        int rotationPoint = nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotationPoint = i;
                break;
            }
        }

        int res = binarySearch(nums, target, 0, rotationPoint);

        if (res != -1) {
            return res;
        }

        return binarySearch(nums, target, rotationPoint, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        int number = -1;
        while (l <= r) {
            int pivot = l + ((r - l) / 2);
            if (nums[pivot] == target) {
                number = pivot;
                break;
            }
            if (nums[pivot] > target) {
                r = pivot - 1;
            }

            if (nums[pivot] < target) {
                l = pivot + 1;
            }
        }

        return number;
    }
}
