public class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        int k = 0;
        for (Integer i : nums) {
            arr[i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                nums[k] = i;
                arr[i]--;
                k++;
            }
        }
    }
}
