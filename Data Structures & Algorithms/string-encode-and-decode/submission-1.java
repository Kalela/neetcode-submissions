class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append(",");
        }
        sb.append("#");
        for (String str : strs) {
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();
        
        int cutoff = 0;
        char[] characters = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (characters[i] == '#') {
                cutoff = i;
                break;
            }
        }
        final String sizesString = str.substring(0, cutoff);
        final List<Integer> sizes = Arrays.stream(sizesString.split(","))
            .filter(size -> !size.isEmpty())
            .map(size -> Integer.parseInt(size))
            .toList();

        final List<String> strings = new ArrayList<>();
        int cutoffTracker = 0;
        String wordsString = str.substring(cutoff + 1, str.length());

        
        for (int i = 0; i < sizes.size(); i++) {
            strings.add(wordsString.substring(cutoffTracker, cutoffTracker + sizes.get(i)));
            cutoffTracker = sizes.get(i);
        }

        return strings;
    }
}
