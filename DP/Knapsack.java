package DP;

import java.util.Arrays;

public class Knapsack {
    private static int solve(int i, int C, int[] val, int[] wt, int [][] dp) {
        if(i<0) return 0;
        if(dp[i][C] != -1) return dp[i][C];

        int skip = solve(i-1, C, val, wt, dp);
        if(wt[i]>C) return skip;
        int pick = val[i] + solve(i-1, C-wt[i], val, wt, dp);
        return dp[i][C] = Math.max(skip, pick);
    }
    public static void main(String[] args) {
        int [] val = {5,3,7,16};
        int [] wt = {1,2,8,10};
        int capacity = 8;
        int dp[][] = new int[val.length][capacity+1];
        for(int [] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = solve(val.length-1, capacity, val, wt,dp);
        System.out.println(ans);
    }
}
