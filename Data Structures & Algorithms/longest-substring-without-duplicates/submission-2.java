class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new HashSet<>();
        int res = 0;

        int l = 0, r = 0;
        char[] sArray = s.toCharArray();
        while (r < s.length()) {
            if (store.contains(sArray[r])) {
                res = Math.max(res, r - l);
                l++;
                r = l;
                store = new HashSet<>();
                continue;
            } else {
                store.add(sArray[r]);
            }
            r++;
        }

        return Math.max(res, store.size());
    }
}
