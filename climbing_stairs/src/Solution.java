public class Solution {
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i < n+1; i++){
            int temp = n1;
            n1 = n2;
            n2 = temp+n2;
        }
        return n2;
    }
}
