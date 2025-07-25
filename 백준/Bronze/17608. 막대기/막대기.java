import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sticks = new int[n];
        
        for (int i = 0; i < n; i++) {
            sticks[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (sticks[i] > max) {
                cnt++;
                max = sticks[i];
            }
        }

        System.out.println(cnt);
    }
}