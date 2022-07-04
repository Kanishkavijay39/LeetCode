class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        //new array to store candies
        int[] candy=new int[n];
        
        //sab m atleast 1 toh hona hi chahiye
        for(int i=0;i<n;i++){
            candy[i]=1;
        }
        //if right ele is high then +1 of left
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candy[i]=candy[i-1]+1;
            }
        }
        //if left ele is high so ulta loop chla dete h
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candy[i]=Math.max(candy[i+1]+1,candy[i]);
            }
        }
        
        //now take sum of candies
        int sum=0;
        for(int i:candy){
            sum+=i;
        }
        
        return sum;
    }
}