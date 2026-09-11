class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[r], heights[l]);
            maxArea = Math.max(maxArea, width * height);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
            
        }

        return maxArea;
    }
}
