class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] possibleMatch = null;

        int l = 0, r = matrix.length - 1;
        while (l <= r) {
            int pivot = l + ((r - l) / 2);
            if (matrix[pivot][0] == target) {
                return true;
            }
            if (matrix[pivot][0] < target && matrix[pivot][matrix[pivot].length - 1] < target) {
                l = pivot + 1;
            }

            if (matrix[pivot][0] > target && matrix[pivot][matrix[pivot].length - 1] > target) {
                r = pivot - 1;
            }
            if (matrix[pivot][0] < target && matrix[pivot][matrix[pivot].length - 1] > target) {
                
                possibleMatch = matrix[pivot];
                break;
            }
        }

        if (possibleMatch == null) {
            return false;
        }

        l = 0;
        r = possibleMatch.length - 1;

        while(l < r) {
            int pivot = l + ((r - l) / 2);
            if (possibleMatch[pivot] == target) {
                return true;
            }

            if (possibleMatch[pivot] > target) {
                r = pivot - 1;
            }

            if (possibleMatch[pivot] < target) {
                l = pivot + 1;
            }
        }

        return false;
    }
}
