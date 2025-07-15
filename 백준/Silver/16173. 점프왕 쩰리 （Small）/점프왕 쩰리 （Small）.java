import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] map;
    static boolean[][] visited;
    static int N;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                visited[i][j] = false;
            }
        }

        boolean result = dfs(0, 0);

        if (result) {
            System.out.println("HaruHaru");
        }
        else {
            System.out.println("Hing");
        }
    }

    private static boolean dfs(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= N || visited[x][y]) {
            return false;
        }
        if (x == N - 1 && y == N - 1) {
            return true;
        }

        visited[x][y] = true;
        int jump = map[x][y];

        return dfs(x + jump, y) || dfs(x, y + jump); 
    }
}