class Solution {
    public void nextPermutation(int[] nums) {
        int sp=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                sp=i;
                break;
            }
        }
       if(sp==-1) reverse (nums,sp+1,nums.length-1);
        else{
        int ep=nums.length-1;
        for(int i=nums.length-1;i>=sp;i--){
            if(nums[i]>nums[sp]){
                ep=i;
                break;
            }
        }
        swap(nums,sp,ep);
        reverse(nums,sp+1,nums.length-1);
        }
    }
    public void swap(int[] nums,int sp,int ep){
        int temp=nums[sp];
        nums[sp]=nums[ep];
        nums[ep]=temp;
    }
    public void reverse(int[] nums,int sp,int ep){
        while(sp<ep){
            swap(nums,sp,ep);
            sp++;
            ep--;
        }
    }
}