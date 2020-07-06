/**
 *
 *  寻找一个容器来记录映射关系即可。
 *  举例:(为了好说明，我们取words一个)
 *
 *     1. 比如 words = "abc",pattern = "abc";
 *     a ----> a
 *     b ---> b
 *     c ---> c
 *
 *     2. 比如 words = "ccc",pattern = "abc";
 *     c ---> a
 *     c ----> b x 已经有c和a映射，不可再映射
 *
 *     3. 比如 words = "abc",pattern = "bbb";
 *
 *     a ---> b
 *     b ---> b x 已有b和a映射，不可再映射（这里需要想到，也就是下面的!(hashMap.values().contains(t2)))，可以仔细思考一下）
 *
 */

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character,Character> hashMap = new HashMap<Character,Character>();
        List<String> res = new ArrayList<>();
        for (String s : words) {
            boolean pass = true;
            for (int i = 0; i < pattern.length() && pass; i++) {
                char t1 = pattern.charAt(i), t2 = s.charAt(i);
                // 如果没有绑定且匹配符没有和其他的key绑定
                if (!hashMap.containsKey(t1) && !(hashMap.values().contains(t2))) {
                    hashMap.put(t1,t2);
                } else {
                    if (null == hashMap.get(t1)
                            || (int)hashMap.get(t1) != (int)(t2)) {
                        pass = false;
                    }
                }
            }
            if (pass) {
                res.add(s);
            }
            hashMap.clear();
        }
        return res;
    }
}