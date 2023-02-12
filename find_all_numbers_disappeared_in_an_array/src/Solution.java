import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> endList = new ArrayList<>();
        for (int c : nums) {
            list.add(c);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                endList.add(i);
            }
        }
        return endList;
    }
}

