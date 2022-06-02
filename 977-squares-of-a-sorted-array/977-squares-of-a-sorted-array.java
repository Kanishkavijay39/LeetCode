class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1=0,p2=nums.length-1;
        int[] sqar=new int[nums.length];
        int idx=sqar.length-1;
        while(p1<=p2){
            int v1=nums[p1]*nums[p1],v2=nums[p2]*nums[p2];
            if(v1>=v2){
                sqar[idx]=v1;
                p1++;
            }
            else{
                sqar[idx]=v2;
                p2--;
            }
          idx--;  
        }
    return sqar;
    }
}