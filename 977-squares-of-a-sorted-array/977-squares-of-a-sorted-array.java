class Solution {
    public int[] sortedSquares(int[] nums) {
        int s=nums.length;
        int[] as=new int[s];
        for(int i=0;i<s;i++){
            as[i]=nums[i]*nums[i];
        }
        Arrays.sort(as);
        return as;
    }
}