class ques1 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < bestBuy) {
                bestBuy = prices[i];   // update minimum buying price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
        }

        return maxProfit;
    }
}
