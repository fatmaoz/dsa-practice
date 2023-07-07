package highly_profitable_months;

import java.util.Arrays;
import java.util.List;

/**
 Highly Profitable Months

 The stocks of a company are being surveyed to analyze the net profit of the company over a period.
 For an analysis parameter k, an interval
 of k consecutive months is said to be highly profitable if the values of the stock prices are strictly increasing for those months. Given the stock prices of the company for n months and the analysis parameter k, find the number of highly profitable intervals.
 Example
 stockPrices = [5, 3, 5, 7, 8]
 */
public class HighlyProfitableMonths {
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

    private static int highlyProfitableIntervals(List<Integer> stockPrices, int k){
        if (k==1){
            return stockPrices.size();
        }
        int result = 0;
        int startIndex = 0;
        int lastIndex = 0;

        while (lastIndex<stockPrices.size()-1){
            int last1 = stockPrices.get(lastIndex);
            int last2 = stockPrices.get(lastIndex+1);
            if (last2>last1){
                lastIndex++;
            }else {
                startIndex++;
            }

            if (startIndex>lastIndex){
                lastIndex=startIndex;
            }

            if(lastIndex-startIndex==k-1){
                result++;
                startIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] stockPrices = {6, 1, 2, 3, 3, 4, 5, 3};
        List<Integer> stockList = Arrays.asList(6,1,2,3,3,4,5,3);
        int k = 3;
        int count = highlyProfitableIntervals(stockList, k);
        System.out.println(count);  // Output: 2
    }
}