class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int val=1;
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(val);
                val=val*(i-j)/(j+1);
            }
            ans.add(temp);
        }
        return ans;
    }
}