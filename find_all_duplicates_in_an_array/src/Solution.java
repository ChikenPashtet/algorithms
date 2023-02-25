import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] temp = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();

        for (Integer x : nums){
            temp[x]++;
        }
        for (int k = 0; k < temp.length; k++){
            if (temp[k] > 1){
                result.add(k);
            }
        }
        return result;
    }
}
