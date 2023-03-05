import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums){
            if (map.containsKey(i)){
                int temp = map.get(i) + 1;
                map.put(i, temp);
            }
            else{
               map.put(i,1);
            }
        }
        for (int j = 0; j < k; j++){
            int tempKey = maxInMap(map);
            result[j] = tempKey;
            map.remove(tempKey);
        }
        return result;
    }

    private int maxInMap(HashMap<Integer, Integer> map) {
        int maxKey = map.keySet().stream()
                .max(Comparator.comparing(map::get))
                .orElse(null);
        return maxKey;
    }
}
