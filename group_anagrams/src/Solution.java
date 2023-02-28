import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String sort = sort(strs[i]);
            if (hashMap.containsKey(sort)) {
                hashMap.get(sort).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(sort, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        hashMap.forEach((s, strings) -> result.add(strings));
        return result;
    }

    public String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.copyValueOf(arr);
    }
}
