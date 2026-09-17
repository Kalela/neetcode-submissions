class Solution {
    public int search(int[] nums, int target) {
        int numberOfRotations = nums.length;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                numberOfRotations = i + 1;
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


        return number != -1 ? number + numberOfRotations : number;
    }
}
