class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int k = 0; k < nums.length; k++) {
                if(k == i) {
                    continue;
                }
                product = product * nums[k];
            }
            res[i] = product;
        }

        return res;
    }
}  
