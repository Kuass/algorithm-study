package kr.kua.inflearn._푸샵맨.dynamicProgramming;

import java.util.Arrays;

public class coinChange {
    public static void main(String args[]) {
        coinChange a = new coinChange();
        System.out.println(a.solve(new int[] { 1, 2, 5 }, 11));
    }

    public int solve(int[] coins, int amount) {
        // 1.
        int max =  amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;

        // 2.
        for (int i = 1; i <= amount; i++) {
             for (int j = 0; j < coins.length; j++) {
                 if (i >= coins[j]) {
                     dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                 }
             }
        }

        return dp[amount] > amount ? -1 : dp[amount]
;    }
}
