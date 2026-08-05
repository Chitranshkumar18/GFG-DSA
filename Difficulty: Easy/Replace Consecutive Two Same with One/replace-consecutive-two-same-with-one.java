class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();

        if (n == 0) return "";

        StringBuilder sb = new StringBuilder();

        // Add the last character first
        sb.append(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.reverse().toString();
    }
}