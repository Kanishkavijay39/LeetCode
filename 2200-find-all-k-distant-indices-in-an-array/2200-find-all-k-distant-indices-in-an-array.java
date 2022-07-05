class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        ArrayList<Integer> ar=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key) {
                ar.add(i);
            }
        }
        for(int i=0;i<n;i++){
            for(int j:ar){
                if(Math.abs(i-j)<=k && nums[j]==key) {
                    st.add(i);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>(st);
        Collections.sort(ans);
        return ans;
    }
}