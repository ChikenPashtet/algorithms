public class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        int max_length = 0;
        int i = 1;
        int k = 0;
        while (i < s.length()) {
            String temp = s.substring(k, i);
            if (isPalindrome(temp)) {
                i++;
            } else {
                if (temp.length() > max_length) {
                    max = temp;
                    max_length = temp.length();
                    k++;
                    i = k + 1;
                }
            }
        }
        return max;
    }

    public boolean isPalindrome(String x) {
        int length = x.length();
        for (int i = 0; i < length / 2; i++) {
            if (x.charAt(i) != x.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
