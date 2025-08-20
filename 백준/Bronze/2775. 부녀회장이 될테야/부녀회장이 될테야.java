import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] apt = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                apt[0][j] = j;
            }

            for (int f = 1; f <= k; f++) {
                for (int r = 1; r <= n; r++) {
                    if (r == 1) {
                        apt[f][r] = 1;
                    }
                    else {
                        apt[f][r] = apt[f][r - 1] + apt[f - 1][r];
                    }
                }
            }

            System.out.println(apt[k][n]);
        }
    }
}