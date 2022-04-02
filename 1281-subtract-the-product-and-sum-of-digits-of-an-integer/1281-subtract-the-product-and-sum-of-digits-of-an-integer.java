class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n,prod=1,sum=0;
        while(temp!=0){
            int digit=temp%10;
             prod*=digit;
            sum+=digit;
            temp=temp/10;
        }
        int res=prod-sum;
        return res;
    }
}