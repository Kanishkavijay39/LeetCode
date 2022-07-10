class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int high=2;
        int secHigh=1;
        int t=0;
        while(amount[high]>0 && amount[secHigh]>0){
            amount[high]--;
            amount[secHigh]--;
            Arrays.sort(amount);
            t++;
        }
        while(amount[high]>0){
            amount[high]--;
            t++;
        }
        return t;
    }
}