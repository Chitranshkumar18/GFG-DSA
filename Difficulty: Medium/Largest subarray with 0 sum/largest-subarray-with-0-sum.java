class Solution {
    int maxLength(int arr[]) {
       HashMap<Integer, Integer> map = new HashMap<>();

       int sum = 0;
       int max = 0;

       for (int i = 0; i < arr.length; i++) {

           sum += arr[i];

           // If prefix sum becomes 0
           if (sum == 0) {
               max = i + 1;
           }

           // If same prefix sum appeared before
           else if (map.containsKey(sum)) {
               max = Math.max(max, i - map.get(sum));
           }

           // Store only first occurrence
           else {
               map.put(sum, i);
           }
       }

       return max;
        
    }
}