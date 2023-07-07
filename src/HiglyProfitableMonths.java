public class HiglyProfitableMonths {

    /**
     * Highly Profitable Months
     * <p>
     * The stocks of a company are being surveyed to analyze the net profit of the company over a period.
     * For an analysis parameter k, an interval
     * of k consecutive months is said to be highly profitable if the values of the stock prices are strictly increasing for those months. Given the stock prices of the company for n months and the analysis parameter k, find the number of highly profitable intervals.
     * Example
     * stockPrices = [5, 3, 5, 7, 8]
     */
    public static int countHighlyProfitableIntervals(int[] stockPrices, int k) {
        if (k == 1) return 1;
        int count = 0;
        int n = stockPrices.length;

        for (int i = 0; i <= n - k; i++) {
            boolean isIncreasing = true;
            for (int j = i + 1; j < i + k; j++) {
                if (stockPrices[j] <= stockPrices[j - 1]) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] stockPrices = {6, 1, 2, 3, 3, 4, 5, 3};
        int k = 3;
        int count = countHighlyProfitableIntervals(stockPrices, k);
        System.out.println(count);  // Output: 2
    }

}
