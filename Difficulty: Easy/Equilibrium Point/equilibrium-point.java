class Solution {
    public static int findEquilibrium(int arr[]) {
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        long leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // right sum

            if (leftSum == totalSum) {
                return i; // 0-based index
            }

            leftSum += arr[i];
        }

        return -1;
    }
}