import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        s = String.valueOf(temp1);
        t = String.valueOf(temp2);
        return s.equals(t);

    }
}
