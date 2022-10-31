class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        //brute force make 2 pairs by using 2 for loops O(n^2)
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }else if(nums[l]+nums[r]<target) l++;
            else r--;
        }
        return ans;
    }
}