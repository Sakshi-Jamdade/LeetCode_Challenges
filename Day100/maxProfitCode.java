class maxProfitCode
{
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) 
        {
            if (price < minPrice) 
            {
                minPrice = price; // Update minimum price
            } 
            else 
            {
                maxProfit = Math.max(maxProfit, price - minPrice); 
            }
        }
        return maxProfit;
    }
}