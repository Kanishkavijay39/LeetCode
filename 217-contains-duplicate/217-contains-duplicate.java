class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int curr=nums[i],prev=nums[i-1];
            if(curr==prev)
                return true;
        }
        return false;
    }
}