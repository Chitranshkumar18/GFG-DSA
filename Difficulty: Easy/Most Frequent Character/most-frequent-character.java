class Solution {
    public static char getMaxOccuringChar(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int maxFreq = 0;
        char ans = 'a';

        // Find character with maximum frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
}