class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int size=m+n;
        int[] arr=new int[size];
        int p1=n-1,p2=m-1,p3=size-1;
        while(p3>=0){
            int v1=(p1>=0)?nums1[p1]:Integer.MIN_VALUE;
            int v2=(p2>=0)?nums2[p2]:Integer.MIN_VALUE;
            if(v1>=v2){
                arr[p3]=v1;
                p1--;
            }else{
                arr[p3]=v2;
                p2--;
            }
            p3--;
        }
        
        double ans=0;
        
        int mid=(size-1)/2;
        if(size%2==0){
            //even
            int a=arr[mid];
            int b=arr[mid+1];
            ans=(a+b)/2.0;
        }else{
            int a=arr[mid];
            ans=a;
        }
        return ans;
    }  
}