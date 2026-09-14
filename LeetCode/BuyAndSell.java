package LeetCode;


public class BuyAndSell {
    static int BuyAndSellStock(int profits[]){
        int MaxProfit = Integer.MIN_VALUE;
        int n = profits.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                int CurrProfit = profits[j] - profits[i];
                if(CurrProfit > MaxProfit){
                    MaxProfit = CurrProfit;
                }
            }
        }
        return MaxProfit;
    }

    static int BuyAndSellStock1(int profits[]){
        int MinPrice = Integer.MAX_VALUE;
        int n = profits.length;
        int MaxProfit = 0;

        for(int i=0;i<n;i++){
            if(profits[i] < MinPrice){
                MinPrice = profits[i];
            }
            int Profit = profits[i] - MinPrice;
            MaxProfit = Math.max(MaxProfit, Profit);
        }
        return MaxProfit;
    }

    public static void main(String args[]){
        int profits[] = {7,1,5,3,6,4};
        int result = BuyAndSellStock1(profits);
        if(result <= 0){
            System.out.println("0");
        }
        else{
            System.out.println(result);
        }
    }
}
