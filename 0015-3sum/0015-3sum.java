class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0 ;
        while (i < nums.length-2){
            int l = i+1 , r = nums.length-1;
            
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if(sum == 0){
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    
                    ans.add(triplet);
                }
                
                while(sum <= 0 && (nums[l] == nums[++l] && l < r));
                while(sum >= 0 && (nums[r] == nums[--r] && l < r));
            }
            
            while(nums[i] == nums[++i] && i < nums.length-2);
        }
        
        return ans;
    }
}