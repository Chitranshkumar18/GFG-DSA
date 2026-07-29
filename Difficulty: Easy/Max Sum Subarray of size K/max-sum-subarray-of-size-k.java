class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int windowsum =0;
        for(int i=0;i<k;i++){
            windowsum += arr[i];
        }
        int maxsum = windowsum;
        for(int j=k;j<n;j++){
            windowsum += arr[j];
            windowsum -= arr[j-k];
            maxsum = Math.max(maxsum, windowsum);
        }
        
        return maxsum;
        
    }
}