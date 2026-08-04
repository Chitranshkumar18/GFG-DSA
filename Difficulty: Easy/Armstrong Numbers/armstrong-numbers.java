class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        return original == sum;
    }
}