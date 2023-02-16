public class Solution {
    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int current_min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            max_profit = Math.max(max_profit, price - current_min);
            current_min = Math.min(current_min, price);
            System.out.println("max_profit = " + max_profit + " current_min = " + current_min);
        }
        System.out.println(max_profit);
        return max_profit;
    }
}
