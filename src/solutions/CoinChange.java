package solutions;

import java.util.HashMap;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        return makeChange(coins, amount, new HashMap<>());
    }

    private int makeChange(int[] coins, int rem, HashMap<Integer, Integer> mem) {
        if (rem < 0) return -1;
        if (rem == 0) return 0;
        if (mem.containsKey(rem)) return mem.get(rem);
        int best = Integer.MAX_VALUE;
        for (int coin: coins) {
            int res = makeChange(coins, rem - coin, mem);
            if (res > -1 && res < best) best = 1 + res;
        }
        mem.put(rem, best == Integer.MAX_VALUE ? -1 : best);

        return mem.get(rem);
    }
}
