class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int p1=s.length()-1;
        int p2=t.length()-1;
        while(p1>=0 && p2>=0){
            char chs=s.charAt(p1);
            char cht=t.charAt(p2);
            if(chs==cht){
                p1--;
                p2--;
            }
            else{
                p2--;
            }
        }
        return (p1<0)?true:false;
    }
}