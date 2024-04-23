public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
            int[] prices = {5,2,6,1,4};
        System.out.println(profit(prices));
    }
    static int profit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for(int i = 0 ; i<prices.length ; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
