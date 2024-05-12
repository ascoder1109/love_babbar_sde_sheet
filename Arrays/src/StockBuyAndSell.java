public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

    int maxPro = maximumProfit(arr);
    System.out.println("Max profit is: " + maxPro);
    }
    public static int maximumProfit(int arr[]){
        int n = arr.length;
        int maxProfit = 0;
        int minumumPrice = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            minumumPrice = Math.min(minumumPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-minumumPrice);
        }
        return maxProfit;
    }
}
