/**
 *  这题解法很巧妙，参考了LeetCode的一位同学的解法，亦可移步 (https://leetcode-cn.com/problems/increasing-decreasing-string/solution/1370java-yong-shu-zu-dai-ti-hashmapde-xian-xing-su/)
 *
 *  think：
 *      1. 我们考虑把每个字符出现的次数先存入int[]
 *      2. 我们把int[] 从小到大遍历一遍，再从大到小遍历一遍是否就得出了结果呢？
 *          2.1 这里要考虑如果当前（currentIndex[i]）没有值的情况如何处理？
 *          2.2 我们用掉一个，就要减掉一个(currentIndex[i] -= 1 )
 *      3. 题中说直到无法进行，则意味着记录容器 = 传入s 的大小时。
 *
 *  perfect，很妙。
 */
class Solution {
    public String sortString(String s) {
        // 记录每个字母的可用个数
        int[] availableCount = new int[26];
        for (char c : s.toCharArray()) {
            availableCount[c - 'a'] += 1;
        }
        StringBuffer container = new StringBuffer();
        while (container.length() < s.length()) {
            for (int i = 0 ; i < availableCount.length; i++) {
                if (availableCount[i] == 0) {
                    continue;
                }
                container.append((char)(i + 'a'));
                availableCount[i] -= 1;
            }
            for (int i = 25; i >= 0; i--) {
                if (availableCount[i] == 0) {
                    continue;
                }
                container.append((char)(i + 'a'));
                availableCount[i] -= 1;
            }
        }
        return container.toString();
    }
}