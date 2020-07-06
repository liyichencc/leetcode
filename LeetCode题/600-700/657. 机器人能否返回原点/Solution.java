/**
 * Q: 机器人能否回到原点的关键何在？
 * A: 上下 、 左右 移动步数是否一致呢？
 *
 * 如此一来，这题解起来是不是很easy？
 *
 */

class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int left = 0,right = 0,up = 0,down = 0;
        for (char c : ch) {
            switch(c) {
                case 'R':
                    right++;
                    break;
                case 'L':
                    left++;
                    break;
                case 'U':
                    up++;
                    break;
                case 'D':
                    down++;
                    break;
            }
        }
        return (left - right) == 0 && (up - down) == 0;
    }
}