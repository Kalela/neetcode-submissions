class Solution {
    public int search(int[] nums, int target) {
        int rotationPoint = nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotationPoint = i;
                break;
            }
        }

        System.out.println("rotationPoint " + rotationPoint);


        int res = binarySearch(nums, target, 0, rotationPoint - 1);

        if (res != -1) {
            return res;
        }

        return binarySearch(nums, target, rotationPoint, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        System.out.println("l " + l);
        System.out.println("r " + r);
        int number = -1;
        while (l <= r) {
            int pivot = l + ((r - l) / 2);
            System.out.println("pivot " + pivot);
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
