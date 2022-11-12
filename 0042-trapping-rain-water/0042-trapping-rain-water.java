class Solution {
    public int trap(int[] height) {
        int[] right= new int[height.length];
        int[] left=new int[height.length];
        int c=0;
        right[0]=height[0];
        for(int i=1;i<height.length;i++){
            right[i]=Math.max(height[i],right[i-1]);
        }
        left[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            left[i]=Math.max(left[i+1],height[i]);
        }
        for(int i=0;i<height.length-1;i++){
            c+=Math.min(left[i],right[i])-height[i];
        }
        return c;
    }
}