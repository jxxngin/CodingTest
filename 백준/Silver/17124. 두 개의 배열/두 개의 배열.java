import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B);

            long sum = 0;
            for (int i = 0; i < N; i++) {
                int C = getClose(B, A[i]);
                sum += C;
            }
            
            T--;
            System.out.println(sum);
        }
    }

    private static int getClose(int[] arr, int target) {
        int idx = lowerBound(arr, target);
        int res;

        if (idx == 0) {
            res = arr[0];
        }
        else if (idx == arr.length) {
            res = arr[arr.length - 1];
        }
        else {
            int before = arr[idx - 1];
            int after = arr[idx];

            int diff1 = Math.abs(target - before);
            int diff2 = Math.abs(target - after);

            if (diff1 < diff2) {
                res = before;
            }
            else if (diff1 > diff2) {
                res = after;
            }
            else {
                res = Math.min(before, after);
            }
        }

        return res;
    }

    private static int lowerBound(int[] arr, int key) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (key <= arr[mid]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}