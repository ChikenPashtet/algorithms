import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        int mask = 0;
        for (int c : nums){
            mask = mask ^ c;
            System.out.println("mask = "+mask + ", c = "+c);

        }
        return mask;
    }
}
