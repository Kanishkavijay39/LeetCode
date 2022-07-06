class Solution {
    
    public void recCom(List<List<Integer>> ansList,List<Integer> ds,int[] arr,int target,int idx){
        if(idx==arr.length){
            if(target==0)
                ansList.add(new ArrayList<>(ds));
        return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            recCom(ansList,ds,arr,target-arr[idx],idx);
            ds.remove(ds.size()-1);
        }
        
        recCom(ansList,ds,arr,target,idx+1);
    }
        
        
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        recCom(ans,ds,candidates,target,0);
        return ans;
    }
}