package DP;

public class KnapsackTabulation {
    public static void main(String[] args) {
        int [] val = {5,3,7,16};
        int [] wt = {1,2,8,10};
        int capacity = 8;
        int n = val.length;
        int dp[][] = new int[n][capacity+1];
        for(int i = 0;i<n;i++){
            for(int c = 0;c<=capacity;c++){
            int skip = (i<=0) ? 0 : dp[i-1][c];
            if(wt[i]>c){
                dp[i][c] =  skip;
            }else{
                int pick = val[i];
                pick += (i<=0) ? 0 : dp[i-1][c-wt[i]];
                dp[i][c] = Math.max(skip, pick);
            }
            }
        }
        System.out.println(dp[n-1][capacity]);
    }
}
