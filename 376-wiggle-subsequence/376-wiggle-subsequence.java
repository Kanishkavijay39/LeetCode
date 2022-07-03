class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1) return nums.length;
        int up=1,down=1;
        // 2 4 1 7
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){ //uphill
                down=up+1;
            }
            //4 2 4
            else if(nums[i-1]>nums[i]){
                //downhill
                up=down+1;
            }
        }
        return Math.max(up,down);
        
        /* 2 pointer approah not working smthng is wrong in this
        if(nums.length<=1) return nums.length;
        boolean asc=false;
        
        int p1=1,p2=2,c=1;
        // 
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                p1=i+1;
                p2=i+2;
            }
        }
        if(nums[p1-1]<nums[p1]) asc=true;
        while(p2<nums.length){
            if(asc){
                if(nums[p1]>nums[p2]){
                    c++;
                    p1++;
                    p2++;
                    asc=!asc;
                }else{
                    p2++;
                } 
            }
            else{
                if(nums[p1]<nums[p2]){
                    c++;
                    p1++;
                    p2++;
                    asc=!asc;
                }else{
                    p2++;
                }
            }
            
        }
        if(nums[nums.length-1]==nums[nums.length-2])
        return c;
        return c+1;*/
        
    }
}