import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        if (nums.length == 1){
            ArrayList<List<Integer>> temp = new ArrayList<>();
            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.add(nums[0]);
            temp.add(temp2);
            return temp;
        }

        for(int i = 0; i < nums.length; i++){
            int n = nums[0];
            nums = Arrays.copyOfRange(nums, 1, nums.length);
            List<List<Integer>> temp3 = permute(nums);

            for(List<Integer> k : temp3){
                k.add(n);
            }
            result.addAll(temp3);
        }
        return result;
    }
}
