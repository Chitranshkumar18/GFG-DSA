class Solution {
    public int findKRotation(int arr[]) {
         int l=0, h= arr.length-1;
         while(l<h){
             int mid = l+(h-l)/2;
             if(arr[h]<arr[mid]){
                 l=mid+1;
             }
             else{
                 h=mid;
             }
         }
         return l;
        
    }
}