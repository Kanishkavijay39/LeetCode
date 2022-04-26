class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2;
        int ans=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        ans=total-sum;
        return ans;
    }
}