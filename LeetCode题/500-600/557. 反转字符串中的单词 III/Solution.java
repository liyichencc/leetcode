
class Solution {
    public String reverseWords(String s) {
        String[] str =  s.split(" ");
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            res.append(new StringBuffer(str[i]).reverse());
            if (i < str.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}