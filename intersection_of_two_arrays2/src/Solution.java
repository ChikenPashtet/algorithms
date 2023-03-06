import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1000];
        for (Integer i : nums1){
            arr[i]++;
        }
        for (Integer j : nums2){
            if (arr[j] != 0){
                list.add(j);
                arr[j]--;
            }
        }
        int[] result = new int[list.size()];
        int l = 0;
        for (Integer k : list){
            result[l] = k;
            l++;
        }
        return result;
    }
}
