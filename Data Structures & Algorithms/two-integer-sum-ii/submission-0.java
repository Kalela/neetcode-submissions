class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int leftNumber = numbers[l];
            int rightNumber = numbers[r];
            if ((leftNumber + rightNumber) == target) {
                return new int[] {l + 1, r + 1};
            } 
            if ((leftNumber + rightNumber) > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[2];
    }
}
