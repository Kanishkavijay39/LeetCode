class Solution {
   public double myPow(double a, int b) {
     if(b == 0)
        return 1;
    else{
        double res = myPow(a, b/2);
        if(b % 2 < 0)
            return res * res / a;
        else if(b % 2 > 0)
            return res * res * a;
        else
            return res * res;
    }
}
}