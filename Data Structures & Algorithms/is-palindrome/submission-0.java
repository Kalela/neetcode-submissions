class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] stringCharacters = s.toLowerCase().toCharArray();
        while (left < right) {
            if (!Character.isLetterOrDigit(stringCharacters[left])) {
                left++;
            }
            if (!Character.isLetterOrDigit(stringCharacters[right])) {
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
