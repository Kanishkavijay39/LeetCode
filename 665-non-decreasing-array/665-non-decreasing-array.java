class Solution {
    public boolean checkPossibility(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int idx=0;
        for(int i=1;i<n;++i){ //0 wala pehla decreasing hoga 
            if(nums[i]<nums[i-1]){ //pehla dip milgya
                if(idx!=0){     //first dip aaya toh woh ghus ke idx!=0 kr dega
                return false; }   //jaise 2 dip aayega waise hi false ho jayega
                idx=i;
            }
        }
        
        //now only 1 dip is there
        
        //agar boundary counditions pe h toh koi dikkat nhi h nahi 1 wale pe
        
        if(idx==0 || idx==1 || idx==n-1)  return true;
        
        if(nums[idx-1]>nums[idx+1] && nums[idx-2]>nums[idx])  return false;
     
        return true;
    }
}