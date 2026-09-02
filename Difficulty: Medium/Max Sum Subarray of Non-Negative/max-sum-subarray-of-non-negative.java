import java.util.*;

class Solution {
    public ArrayList<Integer> findSubarray(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        long maxSum = -1;
        long sum = 0;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i <= arr.length; i++) {

            // End of array OR negative element
            if (i == arr.length || arr[i] < 0) {

                // Check only if non-negative subarray actually exists
                if (start < i) {

                    int currentLength = i - start;
                    int bestLength = ansStart == -1 ? 0 : ansEnd - ansStart + 1;

                    if (sum > maxSum ||
                        (sum == maxSum && currentLength > bestLength)) {

                        maxSum = sum;
                        ansStart = start;
                        ansEnd = i - 1;
                    }
                }

                // Start new subarray after negative
                start = i + 1;
                sum = 0;

            } else {

                sum += arr[i];
            }
        }

        // All elements are negative
        if (ansStart == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = ansStart; i <= ansEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}