import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int c : nums) {
            sum += c;
        }
        return (nums.length + 1) * (nums.length) / 2 - sum;
    }
}
