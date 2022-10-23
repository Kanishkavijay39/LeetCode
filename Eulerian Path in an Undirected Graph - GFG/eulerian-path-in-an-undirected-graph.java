//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            for(int i = 0;i < N;i++){
                String a[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < N;j++)
                    graph[i][j] = Integer.parseInt(a[j]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.eulerPath(N, graph));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int eulerPath(int N, int graph[][]){
        int[] deg=new int[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(graph[i][j]==1) deg[i]++;
            }
        }
        int ec=0,oc=0;
        for(int i:deg){
            if(i%2==0) ec++;
            else oc++;
        }
        if(oc==2) return 1;
        return 0;
    }
}