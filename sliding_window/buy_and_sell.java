package sliding_window;

public class buy_and_sell {
    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(prices[i]-buy, profit);
        }
        return profit;
    }
}
