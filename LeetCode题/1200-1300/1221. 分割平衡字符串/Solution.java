class Solution {
    public int balancedStringSplit(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int count = 0;
        for (char ch : str) {
            if (ch == 'L') {
                l++;
            } else {
                l--;
            }
            if (l == 0) {
                count++;
            }
        }
        return count;
    }
}