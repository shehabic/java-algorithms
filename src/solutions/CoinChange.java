package solutions;

import java.util.HashMap;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        return makeChange(coins, amount, new HashMap<>());
    }

    private int makeChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (memo.containsKey(amount)) return memo.get(amount);
        int best = Integer.MAX_VALUE;
        for (int coin : coins) {
            int num = makeChange(coins, amount - coin, memo);
            if (num != -1 && best > num) best = num + 1;
        }
        memo.put(amount, best == Integer.MAX_VALUE ? -1 : best);
        return memo.get(amount);
    }
}
