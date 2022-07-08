class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            if(Math.abs(min)>Math.abs(n))
                min=n;
            else if(Math.abs(min)==Math.abs(n)) 
                min=Math.max(min,n);
        }
        
        return min;
    }
}