class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        for(char ch : word.toCharArray()) {
            if(Character.isUpperCase(ch))
                c++;
        }
        if(c == word.length() || c == 0) return true;
        return c == 1 && Character.isUpperCase(word.charAt(0));
    }
}