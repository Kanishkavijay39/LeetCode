class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        
        for(int i=0;i<haystack.length();i++){
            char chh=haystack.charAt(i);
            char ch=needle.charAt(0);
            if(chh==ch) {
                int l=i,k=0;
                while(l<haystack.length() && k<needle.length()){
                    if(haystack.charAt(l)==needle.charAt(k))
                    {
                        l++;
                        k++;
                    }
                    else{
                        break;
                    }
                }
                if(k==needle.length()) return i;
            }
        }
        return -1;
    }
}