/**
 *
 *  我们只需要判断n是奇偶数即可
 *  奇数个直接返回奇数个字符
 *  偶数个需要在末尾/头部额外增加一个字符以保证最后返回结果长度是奇数个。
 */
class Solution {
    public String generateTheString(int n) {
        StringBuffer res = new StringBuffer();
        int suffix = 0;
        if (n % 2 == 0) {
            suffix += 1;
            res.append('b');
        }
        for (int i = 0; i < n - sufix; i++) {
            res.append('a');
        }
        return res.toString();
    }
}