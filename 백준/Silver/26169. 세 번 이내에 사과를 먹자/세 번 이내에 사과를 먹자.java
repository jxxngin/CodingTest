import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] map = new int[5][5];
    static boolean found = false;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        dfs(r, c, 0, 0);

        if (found) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private static void dfs(int x, int y, int depth, int cnt) {
        if (found) {
            return;
        }
        
        if (depth > 3) {
            return;
        }

        if (map[x][y] == 1) {
            cnt++;
        }

        if (cnt >= 2) {
            found = true;
            return;
        }

        int original = map[x][y];
        map[x][y] = -1;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) {
                continue;
            }
            if (map[nx][ny] == -1) {
                continue;
            }

            dfs(nx, ny, depth + 1, cnt);
        }

        map[x][y] = original;
    }
}