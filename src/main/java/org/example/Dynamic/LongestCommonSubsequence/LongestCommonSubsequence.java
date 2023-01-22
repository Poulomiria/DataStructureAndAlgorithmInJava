package org.example.Dynamic.LongestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequence
{

    private static int dp[][];
    private static int LCS(String s1, String s2, int n1, int n2, int[][] dp)
    {

        // base case
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        if(dp[n1-1][n2-1] != -1)
        {
            return dp[n1-1][n2-1];
        }
        if(s1.charAt(n1-1) == s2.charAt(n2-1))
        {
            dp[n1-1][n2-1] = 1 + LCS(s1, s2, n1-1, n2-1,dp);

        }else {
            dp[n1-1][n2-1] = Math.max(LCS(s1, s2, n1-1, n2,dp) , LCS(s1, s2, n1, n2-1,dp));
        }
        return dp[n1-1][n2-1];
    }
    //Top Down approach
    /*
    Time Complexity: O(m*n) which is much better than the worst-case time complexity of Naive Recursive implementation.
Auxiliary Space: O(m*n) because the algorithm uses an array of size (m+1)*(n+1) to store the length of the common substrings.
     */
    public static int LCSTopDown(String s1, String s2, int n1, int n2)
    {
        int[][] t = new int[n1+1][n2+1];
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
                    dp[i][j] = Math.max(dp[i-1][j], dp[j-1][i]);
                }
            }
        }

        return dp[n1][n2];
    }
    public static void main(String args[])
    {

        String s1 = "abnmcklop";
        String s2 = "ablop";
        int dp[][] = new int[s1.length()][s2.length()];

        // assign -1 to all positions
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(LCS(s1,s2,s1.length(), s2.length(),dp));
    }

}
