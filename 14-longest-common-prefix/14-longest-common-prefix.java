class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String lcp=strs[0];
        for(int i=1;i<strs.length;i++){
            String curr=strs[i];
            int j=0;
            while(j<curr.length() && j<lcp.length() && curr.charAt(j)==lcp.charAt(j))
                j++;
            if(j==0) return "";
            lcp=curr.substring(0,j);
        }
        return lcp;
    }
}