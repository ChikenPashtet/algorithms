import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length){
            int pos = nums[i]-1;
            if (nums[pos] != nums[i]){
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int c = 0; c < nums.length; c++){
            if (nums[c] != c + 1){
                list.add(c + 1);
            }
        }
        return list;
    }
}

