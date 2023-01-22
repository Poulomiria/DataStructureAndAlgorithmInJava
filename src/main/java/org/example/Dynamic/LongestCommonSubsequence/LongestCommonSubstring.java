package org.example.Dynamic.LongestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubstring {

    //private static int[][] dp;

    public static int LCSubstring(String s1, String s2, int n1, int n2)
    {
        int dp[][] = new int[n1+1][n2+1];
        if(n1 == 0 || n2 == 0)
            return 0;
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                if(i ==0 || j ==0)
                {
                    dp[i][j] =0 ;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                {

                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[n1][n2];
    }
    public static void main(String args[])
    {

        String s1 = "abnmcklop";
        String s2 = "ablop";
        //int dp[][] = new int[s1.length()+1][s2.length()+1];


        System.out.println(LCSubstring(s1,s2,s1.length(), s2.length()));
    }

}
