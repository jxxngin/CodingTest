import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] coins = {25, 10, 5, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();

            int[] result = new int[4];

            for (int j = 0; j < 4; j++) {
                result[j] = c / coins[j];
                c %= coins[j];
            }

            for (int cnt : result) {
                System.out.print(cnt + " ");
            }

            System.out.println();
        }
    }
}