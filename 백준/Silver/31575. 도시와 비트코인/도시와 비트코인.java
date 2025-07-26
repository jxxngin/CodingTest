import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    
    static boolean result = false;

    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);

        if (result) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void dfs(int x, int y) {
        if (x == m - 1 && y == n - 1) {
            result = true;
            return;
        }

        visited[x][y] = true;

        for (int d = 0; d < 2; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < m && ny < n) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}