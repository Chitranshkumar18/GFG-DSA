class Solution {
    int maxValue(int[] arr) {
        int n = arr.length;

        int max1 = arr[0] + 0;
        int min1 = arr[0] + 0;

        int max2 = arr[0] - 0;
        int min2 = arr[0] - 0;

        for (int i = 1; i < n; i++) {
            max1 = Math.max(max1, arr[i] + i);
            min1 = Math.min(min1, arr[i] + i);

            max2 = Math.max(max2, arr[i] - i);
            min2 = Math.min(min2, arr[i] - i);
        }

        return Math.max(max1 - min1, max2 - min2);
    }
}