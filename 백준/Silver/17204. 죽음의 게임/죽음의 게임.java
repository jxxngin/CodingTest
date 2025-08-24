import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cur = 0;
        int step = 0;

        while (true) {
            if (cur == K) {
                System.out.println(step);
                return;
            }
            
            if (visited[cur]) {
                System.out.println(-1);
                return;
            }

            visited[cur] = true;
            cur = a[cur];
            step++;
        }
    }
}