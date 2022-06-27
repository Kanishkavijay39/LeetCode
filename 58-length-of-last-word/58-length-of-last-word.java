class Solution {
    public int lengthOfLastWord(String s) {
         int count = 0;
        char[] chars = s.toCharArray();
        
        for (int i = chars.length - 1; i >= 0; i --) {
            if (chars[i] == ' ' && count > 0) break;
            if (chars[i] != ' ') count ++;
        }
        
        return count;
    }
}