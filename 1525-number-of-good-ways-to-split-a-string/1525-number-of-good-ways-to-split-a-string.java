class Solution {
    public int numSplits(String s) {
        //freq,suffix,prefix array
        int n=s.length();
        int[] freq=new int[26];
        int[] pre=new int[n];
        int[] suf=new int[n];
        
        //prefix array m daalte chalte h unique ch length
        int count=0;
        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'a';
            freq[ch]++;
            if(freq[ch]==1) count++;
            pre[i]=count;
        }
        //suffix m daalte h
        count=0;
        freq=new int[26];
        for(int i=n-1;i>=0;i--){
            int ch=s.charAt(i)-'a';
            freq[ch]++;
            if(freq[ch]==1) count++;
            suf[i]=count;
        }
        // splits  good 2==2 hua toh 1==2 nhi hoga
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(pre[i]==suf[i+1]) ans++;
        }
        return ans;
    }
}