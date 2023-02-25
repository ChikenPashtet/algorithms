import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        int i = 0;
        if (s.isEmpty()){
            return 0;
        }
        if (s.equals(" ")){
            return 1;
        }
        Set<Character> temp = new HashSet<>();
        while(i < arr.length) {
            if (!temp.contains(arr[i])){
                temp.add(arr[i]);
            }else{
                max = Math.max(max, temp.size());
                i -= temp.size() -1;
                temp.clear();

            }
            i++;
        }
        max = Math.max(max, temp.size());
        return max;
    }
}
