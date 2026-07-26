package DP;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(pairTab(n,dp));
    }

    private static int pair(int n, int dp[]) {
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = pair(n-1,dp) + (n-1) * pair(n-2,dp);
    }

    private static int pairTab(int n, int dp[]) {
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
         dp[n]= pair(n-1,dp) + (n-1) * pair(n-2,dp);
        return dp[n];
    }
}
