class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] baseRules
                = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> resultContainer = new HashSet<>();
        for (String str : words) {
            char[] ch = str.toCharArray();
            StringBuffer tempContainer = new StringBuffer();
            for (char c : ch) {
                tempContainer.append(baseRules[(int)(c - 97)]);
            }
            resultContainer.add(new String(tempContainer));
        }
        return resultContainer.size();
    }
}