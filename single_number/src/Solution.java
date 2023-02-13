import java.util.HashSet;

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int c : nums) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        for (int c : set) {
            result = c;
        }
        return result;
    }
}
