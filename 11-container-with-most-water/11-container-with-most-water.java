class Solution {
    public int maxArea(int[] height) {
        int p1=0 ,p2=height.length-1,max=0;
        while(p1<p2){
            int length=Math.min(height[p1],height[p2]);
            int breadth=p2-p1;
            int area=length*breadth;
            max=(max>area)?max:area;
            if(height[p1]<height[p2]){
                p1++;
            }
            else
                p2--;
        }
        return max;
    }
}