class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
         int buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
             
           int  current_profit=prices[i]-buyprice;
             if(current_profit>max_profit){
                max_profit=current_profit;
             }
             if(buyprice>prices[i]){
                buyprice=prices[i];
             }



           

            
        }
        return max_profit;
    }
    
}