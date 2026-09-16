class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       Arrays.sort(piles);
       int max = piles[piles.length - 1];
       int l = 0, r = max - 1;

       int res = max;
       while (l <= r) {
        int pivot = l + ((r - l) / 2);
        int timeTaken = 0;
        for (int pile : piles) {
            int timeToConsumePile = (pile + pivot - 1) / pivot;
            timeTaken += timeToConsumePile;
        }
        if (timeTaken > h) {
            l = pivot + 1;
        }

        if (timeTaken <= h) {
            r = pivot - 1;
            res = Math.min(pivot, res);
        }
       }

       return res;
    }
}
