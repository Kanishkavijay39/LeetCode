class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0,j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            else{
                j++;
            }
        }
        return i+1;
    }
}