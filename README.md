# 项目说明

[LeetCode 官网请点这里](https://leetcode-cn.com/)
<ul>
    该项目是我自己写时对解题过程的记录，可以供大家参考，也便于我偶尔回头来复习。
</ul>

<ul>
    每个题目我都写了一个README.md和解题步骤的Java文件。
    <ol>
        README.md 包含对题目的描述
    </ol>
    <ol>
         Java文件则是对题目的解答
    </ol>
</ul>

<b>描述语言</b>
<ul>
    JAVA
</ul>
    


## 已经更新题目
<h3>字符串篇章</h3> 
<br>
<b>1.</b>  <a href="https://github.com/liyichencc/leetcode/tree/master/面试题/50-60/面试题58-II.%20左旋转字符串/README.md">[面试题58-II. 左旋转字符串]<a> <b>从第n位开始左旋</b>。用到了substring函数。
<br>
<br>
<b>2.</b>  <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1100-1200/1108.%20IP%20地址无效化/README.md">[IP 地址无效化]</a> <b>把输入的“[.]”替换成“.”</b> 用到了replace函数。
<br>
<br>
<b>3.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/面试题/1-10/面试题%2008.09.%20括号/README.md">[面试题 08.09.括号 ]</a> <b>给定数值，输出可能组成的括号对。</b> 用到了回溯算法，要注意剪枝（当left > right）时，此时至少说明有一个“)”括号无法匹配到。
<br>
<br>
<b>4.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/800-900/804.%20唯一摩尔斯密码词/README.md">[804. 唯一摩尔斯密码词]</a> <b>给定摩斯密码表，把输入的单词转成摩斯密码输出。</b> 通过ascll码找到对应的摩斯密码的角标，把一个单词转换的结果放到set中去重后返回set的个数。
<br>
<br>
<b>5.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1400-1500/1436.%20旅行终点站/README.md">[1436. 旅行终点站]</a> <b>给定城市路线，求出路线的终点城市。</b> 如果我们用map的key作为当前的城市，用value作为可以到达的城市，那么如果一个key在map中不可找寻到，则该城市就是终点站。（看一个题解学习的，此方法很巧妙！）
<br>
<br>
<b>6.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1200-1300/1221.%20分割平衡字符串/README.md">[221. 分割平衡字符串]<a> <b>要求平分字符，平分后的字符里L,R的个数要一样。</b> 我们计算L和R出现的次数，如果LR出现次数一致时，就代表可以平分一次。
<br>
<br>


2020.6.30日更新


<br>
<b>7.</b>  <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1300-1400/1309. 解码字母到整数映射/README.md">[1309. 解码字母到整数映射]<a> <b>按规则映射，例如1 --> a , 10# --> j</b> 需要用到ascll编码。
<br>
<br>
<b>8.</b>  <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/600-700/657. 机器人能否返回原点/README.md">[657. 机器人能否返回原点]</a> <b>给定移动步数，判断机器人是否可以回到原点</b> 查看上下、左右移动步数是否一致即可。
<br>
<br>
<b>9.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1300-1400/1370. 上升下降字符串/README.md">[1370. 上升下降字符串 ]</a> <b>上升下降字符，直到无法进行</b> 记录字符出现次数，有小到大、由大到小依次遍历。
<br>
<br>
<b>10.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/1300-1400/1374. 生成每种字符都是奇数个的字符串/README.md">[1374. 生成每种字符都是奇数个的字符串]</a> <b>给定数字n输出奇数个字符</b> 判断n的个数来决定返回字符的个数
<br>
<br>
<b>11.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/500-600/557. 反转字符串中的单词 III/README.md">[557. 反转字符串中的单词 III]</a> <b>反转字符</b> 根据空格分隔，最后一个不需要添加" "
<br>
<br>
<b>12.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/300-400/344. 反转字符串/README.md">[344. 反转字符串]</a> <b>反转字符</b> 
<br>
<br>
<b>13.</b> <a href="https://github.com/liyichencc/leetcode/tree/master/LeetCode题/800-900/890. 查找和替换模式/README.md">[890. 查找和替换模式]<a> <b>要求按照给定的pattern匹配字符</b> 使用容器记录映射关系即可，注意双向key判断是否已经映射,value是否已经映射。
<br>
<br>

2020.7.6日更新