import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String largestNumber(int[] nums) {
        Comparator<String> comp = (s, t1) -> {
            String str1 = s + t1;
            String str2 = t1 + s;
            return str2.compareTo(str1);
        };
        String[] strarr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strarr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strarr, comp);
        StringBuilder sb = new StringBuilder();
        if (strarr[0].charAt(0) == '0') {
            return "0";
        }
        for (String s : strarr)
            sb.append(s);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{9, 8, 7}));
    }
}
