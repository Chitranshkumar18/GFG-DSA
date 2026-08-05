class Solution {
    String firstAlphabet(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i + 1 < s.length()) {
                sb.append(s.charAt(i + 1));
            }
        }

        return sb.toString();
    }
}