class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        String res = "";
        for (String str : strs) {
            res = res + "é" + str;
        }
        return res;
    }

    public List<String> decode(String str) {
        if (str.equals("é")) return List.of("");
        
        List<String> res = Arrays.asList(str.split("é"));
        if(res.size() == 1) {
            return res;
        }
        return res.stream().filter(s -> !s.isEmpty()).toList();
    }
}
