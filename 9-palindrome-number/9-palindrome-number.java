class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x,rev=0,lastDig=0;
        while(temp!=0){
            lastDig=temp%10;
            rev=rev*10+lastDig;
            temp=temp/10;
        }
        if(x==rev) return true;
        return false;
    }
}