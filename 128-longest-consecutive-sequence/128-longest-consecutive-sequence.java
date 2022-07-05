class Solution {
    public int longestConsecutive(int[] nums) {
   
        HashMap<Integer,Boolean> map=new HashMap<>();
        //let assume that all are starting point
        for(int i:nums){
            map.put(i,true);
        }
        //if not then setting them false
        for(int i: nums){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
        }
        
        //now actually working for staring points
        int ml=0;
        for(int i:nums){
            if(map.get(i)==true){
                int tl=1,tsp=i;
                while(map.containsKey(tsp+tl)) tl++;
                if(tl>ml) ml=tl;
            }
        }
        
        return ml;
        
        /* brute force approach tle aa rha h
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int i=0,j=i+1,c=1;
        while(j<nums.length){
            if(nums[j]-nums[i]==1){
                c++;
                max=Math.max(max,c);
            }
            else if(nums[i]==nums[j]) continue;
            else{
                c=1;
            }
        }
        return max;*/
        
        
    }
}