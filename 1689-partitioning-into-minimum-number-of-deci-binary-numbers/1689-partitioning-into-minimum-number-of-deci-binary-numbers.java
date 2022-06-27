class Solution {
    public int minPartitions(String n) {
        int maxDig=0;
        for(int i=0;i<n.length();i++){
            int dig=n.charAt(i)-'0';
            maxDig=Math.max(dig,maxDig);
        }
        return maxDig;
    }
}