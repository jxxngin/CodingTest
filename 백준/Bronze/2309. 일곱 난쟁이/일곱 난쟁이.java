import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;

        int[] men = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            men[i] = sc.nextInt();
            sum += men[i];
        }

        Arrays.sort(men);

        int[] spy = new int[2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int result = sum - (men[i] + men[j]);

                if (result == 100) {
                    spy[0] = i;
                    spy[1] = j;
                    
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != spy[0] && i != spy[1]) {
                System.out.println(men[i]);   
            }
        }
    }
}