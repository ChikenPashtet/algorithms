import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int mask = 0; mask < (1 << length); mask++){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < length; i++){
                if ((mask & (1 << i)) > 0){
                    temp.add(nums[i]);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
