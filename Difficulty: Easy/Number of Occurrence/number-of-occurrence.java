class Solution {
    int countFreq(int[] arr, int target) {
      int first = firsttime(arr, target);
      int last = lasttime(arr, target);
      if(first==-1){
          return 0;
      }
      return last - first + 1;
    }
    
    
    
    int firsttime(int []arr, int x){
        int l =0, h =arr.length-1;
        int idx =-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(arr[mid]>x){
                h = mid-1;
            }
            else if(arr[mid]<x){
                l =mid+1;
            }
            else{
                idx = mid;
                h =mid-1;
            }
        }
        return idx;
    }
    
    
    
    
    int lasttime(int []arr, int x){
        int l =0, h =arr.length-1;
        int idx =-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(arr[mid]>x){
                h = mid-1;
            }
            else if(arr[mid]<x){
                l =mid+1;
            }
            else{
                idx = mid;
                l = mid+1;
            }
        }
        return idx;
    }
    
    
    
}
