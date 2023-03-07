import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 101) {
                k = j;
                break;
            }
        }
        return k;
    }
}
