class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] stringCharacters = s.toLowerCase().toCharArray();
        while (left < right) {
            while ((left < right) && !Character.isLetterOrDigit(stringCharacters[left])) {
                left++;
            }
            while ((right > left) && !Character.isLetterOrDigit(stringCharacters[right])) {
                right--;
            }
            if (stringCharacters[left] != stringCharacters[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}