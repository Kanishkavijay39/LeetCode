class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        // boundary for horizontal
        int maxHeight=Math.max(horizontalCuts[0]-0,h-horizontalCuts[horizontalCuts.length-1]);
        
        //finding max height
        for(int i=1;i<horizontalCuts.length;i++){
            int horiWidth=horizontalCuts[i]-horizontalCuts[i-1];
            maxHeight=Math.max(maxHeight,horiWidth);
        }
        
        //boundary for vertical
        int maxWidth=Math.max(verticalCuts[0]-0,w-verticalCuts[verticalCuts.length-1]);
        
        // finding max width
        for(int i=1;i<verticalCuts.length;i++){
            int vertiWidth=verticalCuts[i]-verticalCuts[i-1];
            maxWidth=Math.max(maxWidth,vertiWidth);
        }
        
        long ans=1L*maxHeight*maxWidth;
        return (int) (ans%1000000007);
    }
}