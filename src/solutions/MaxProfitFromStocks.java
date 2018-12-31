package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProfitFromStocks {

    public int maxProfit(int k, int[] prices) {
        List<Integer> increments = new ArrayList<>();
        int current = 0;
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0 || prices[i] > prices[i - 1]) {
                current += i > 0 ? prices[i] - prices[i - 1] : 0;
                total += i > 0 ? prices[i] - prices[i - 1] : 0;
            } else {
                increments.add(current);
                current = 0;
            }
        }
        if (increments.size() <= k) {
            return total;
        }
        Collections.sort(increments);
        total = 0;
        for (int i = increments.size() - 1; i >= (increments.size() - 1 - k); i--) {
            total += increments.get(i);
        }
        String s = "ddd";
        s.substring(0, 5);

        return total;
    }
}
