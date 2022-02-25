class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arlist= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arlist.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else
                j++;
        }
       int c=0;
        int[] ar=new int[arlist.size()];
        for(int k:arlist)
            ar[c++]=k;
        return ar;
    }
}