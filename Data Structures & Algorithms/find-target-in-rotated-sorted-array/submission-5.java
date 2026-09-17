class Solution {
    public int search(int[] nums, int target) {
        int numberOfRotations = nums.length;
        boolean wasAlreadySorted = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                numberOfRotations = i + 1;
                wasAlreadySorted = false;
                break;
            }
        }

        Arrays.sort(nums);

        int number = -1;
        int l = 0, r = nums.length - 1;
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

        if (wasAlreadySorted) {
            return number;
        }

        return number != -1 ? number + numberOfRotations : number;
    }
}
