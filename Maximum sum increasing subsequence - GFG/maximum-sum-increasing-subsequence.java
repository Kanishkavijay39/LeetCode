//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int a[], int n)  
	{  
	    int[] dp=new int[a.length];
        int ans=0;
        for(int i=0;i<a.length;i++){
            int maxSum=0;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    maxSum=Math.max(maxSum,dp[j]);
                }
            }
            dp[i]=maxSum+a[i];
            ans=Math.max(ans,dp[i]);
        }
        return ans;
	}  
}