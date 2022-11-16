//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        int[] dp=new int[a.length];
        int ans=0;
        for(int i=0;i<a.length;i++){
            int maxLen=0;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    maxLen=Math.max(maxLen,dp[j]);
                }
            }
            dp[i]=maxLen+1;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
} 