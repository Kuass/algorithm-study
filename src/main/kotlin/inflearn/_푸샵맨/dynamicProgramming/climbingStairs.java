package inflearn._푸샵맨.dynamicProgramming;

public class climbingStairs {
    public static void main(String args[]) {
        climbingStairs a = new climbingStairs();
        System.out.println(a.solve(4));
    }

    public int solve(int n) {
        int[] dp = new int[n+1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
