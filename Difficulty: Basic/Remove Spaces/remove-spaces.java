class Solution {
    public String removeSpaces(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                continue;

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}