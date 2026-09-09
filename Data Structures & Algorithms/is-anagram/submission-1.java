class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> countI = new HashMap<>();
        Map<Character, Integer> countK = new HashMap<>();
        for (char i : s.toCharArray()) {
            countI.computeIfPresent(i, (key, val) -> val + 1);
            countI.computeIfAbsent(i, key -> 1);
        }

        for (char k : t.toCharArray()) {
            countK.computeIfPresent(k, (key, val) -> val + 1);
            countK.computeIfAbsent(k, key -> 1);
        }

        for (char y : s.toCharArray()) {
            if (!countI.get(y).equals(countK.get(y))) {
                return false;
            }
        }

        return true;
    }
}
