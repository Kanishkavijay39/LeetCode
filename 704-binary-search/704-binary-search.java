class Solution {
    public int search(int[] nums, int ele) {
     int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(ele==nums[mid]){
                return mid;
            }else if(ele>nums[mid]){
                left=mid+1;
            }else if(ele<nums[mid]){
                right=mid-1;
            }
        }
        return -1;
    }
}