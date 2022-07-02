class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
        int start=0,end=s.length()-1;
        while(start<end){
            char a=s.charAt(start);
            char b=s.charAt(end);
            if(!Character.isLetterOrDigit(a)){
                start++;
            }else if(!Character.isLetterOrDigit(b)){
                end--;
            }else{
                if(a!=b){
                    return false;
                }
                start++;end--;
            }
        }
        return true; 
    }
}