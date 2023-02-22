public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        int i = 0;
        while(num > 0){
            num = (num & 1) == 1 ? num ^ 1 : num >> 1;
            System.out.println(num);
            i++;
        }
        return i;
    }
}
