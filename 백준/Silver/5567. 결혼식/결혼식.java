import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }
        
        int answer = bfs(n, graph);
        System.out.println(answer);
    }

    private static int bfs(int n, List<Integer>[] graph) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        dist[1] = 0;
        q.offer(1);

        int cnt = 0;

        while(!q.isEmpty()) {
            int cur = q.poll();

            if (dist[cur] == 2) {
                continue;
            }

            for (int next: graph[cur]) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;

                    if (dist[next] <= 2) {
                        cnt++;
                    }

                    q.offer(next);
                }
            }
        }

        return cnt;
    }
}