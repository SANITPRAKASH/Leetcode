class Solution {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MAX_VALUE, secondBuy = Integer.MAX_VALUE;
        int firstProfit = 0, secondProfit = 0;

        for (int price : prices) {
            firstBuy = Math.min(firstBuy, price);              // Lowest price for first buy
            firstProfit = Math.max(firstProfit, price - firstBuy); // Max profit after first sell
            secondBuy = Math.min(secondBuy, price - firstProfit);  // Effective price for second buy
            secondProfit = Math.max(secondProfit, price - secondBuy); // Max profit after second sell
        }

        return secondProfit;
    }
}
