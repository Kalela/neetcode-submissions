class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] res = new int[nums.length];
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
            
        }
        if (zeroCount > 1) {
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                res[i] = (nums[i] == 0) ? product : 0;
            } else {
                res[i] = product / nums[i];
            }
        }

        return res;
    }
}  
