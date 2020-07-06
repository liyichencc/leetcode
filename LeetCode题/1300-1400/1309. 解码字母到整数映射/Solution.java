/**
 *  从第一位看起，如果当前位向后两位遇到了 '#' 则说明要按10-26处理，处理完成后直接跳过3位
 *  反之正常处理
 *
 *  Q：如何处理？
 *  A：我们取当前字符的ascll编码与 'a' (97)相加即可得到结果的ascll编码，再将此ascll编码转成字符即可
 *     eg: a ---> 97
 *         b ---> 98 即键盘每个字符都映射一个ascll
 */
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i += 3;
            } else {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 1)) - 1));
                i++;
            }
        }
        return sb.toString();
    }
}