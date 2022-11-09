class Solution {
    public int maxProfit(int[] arr) {
        int bp=0,sp=0,profit=0;
        while(sp<arr.length){
            if(arr[sp]<arr[bp]) bp=sp;
            profit=Math.max(profit,arr[sp]-arr[bp]);
            sp++;
        }
        return profit;
    }
}