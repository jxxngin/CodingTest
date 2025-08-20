import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static long[][] dp = new long[30][30];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(comb(M, N));
        }
    }

    private static long comb(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            dp[n][r] = 1;
            return dp[n][r];
        }

        dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
        return dp[n][r];
    }
}