class Solution {
    public List<Integer> primeRange(int l, int r) {
        List<Integer> ans = new ArrayList<>();

        for (int i = Math.max(l, 2); i <= r; i++) {
            if (isPrime(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}