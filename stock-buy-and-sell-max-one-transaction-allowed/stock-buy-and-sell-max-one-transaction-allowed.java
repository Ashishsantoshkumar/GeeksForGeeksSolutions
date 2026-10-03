class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int minBuy=prices[0];
        int maxNo=-1;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>minBuy){
                maxNo=Math.max(maxNo,prices[i]-minBuy);
            }
            else {
                minBuy=prices[i];
            }
        }
        return maxNo==-1?0:maxNo;
        
    }
}