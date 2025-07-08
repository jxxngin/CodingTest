import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int x = 0;
        int y = 0;
        boolean cross = false;

        for (int i = 0; i < A.length(); i++) {
            if (cross) {
                break;
            }
            
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    x = i;
                    y = j;
                    cross = true;
                    break;
                }
            }
        }

        int rows = B.length();
        int cols = A.length();
        char[][] puzzle = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                puzzle[i][j] = '.';
            }
        }

        for (int i = 0; i < A.length(); i++) {
            puzzle[y][i] = A.charAt(i);
        }

        for (int i = 0; i < B.length(); i++) {
            puzzle[i][x] = B.charAt(i);
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(puzzle[i]);
        }
    }
}