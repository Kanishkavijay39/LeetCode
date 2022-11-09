class Solution {
    public int maxProfit(int[] prices) {
        int sp=0,bp=0,profit=0;
        for(sp=0;sp<prices.length-1;sp++){
            if(prices[sp]>prices[sp+1]){
                profit+=prices[sp]-prices[bp];
                bp=sp+1;
            } 
        }
        if(prices[sp]>prices[bp]){
                profit+=prices[sp]-prices[bp];
        } 
        return profit;
    }
}