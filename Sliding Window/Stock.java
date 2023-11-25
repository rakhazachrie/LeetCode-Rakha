public class Stock {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int profit = 0;
        int sold = 0;

        for (int i=0; i<prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            sold = prices[i] - lsf;
            if (profit < sold){
                profit = sold;
            }
        }
        return profit;
    }
}