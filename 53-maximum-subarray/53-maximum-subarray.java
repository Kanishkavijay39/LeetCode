class Solution {
    public int maxSubArray(int[] nums) {
       /* //saare subarray nikalke fir highest sum dedo
         int max=Integer.MIN_VALUE,subArraySum=0;
        for(int sp=0;sp<nums.length;sp++){
            for(int ep=sp;ep<nums.length;ep++){
                subArraySum += nums[ep];
                max=Math.max(max,subArraySum);
            }
        }
        return max;*/
        
        //kadane's algo
        
        int csum=nums[0];
        int osum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(csum>=0){
                csum+=nums[i];
            }
            else{
                csum=nums[i];
            }
            if(csum>osum) osum=csum;
        }
        return osum;
    }
}