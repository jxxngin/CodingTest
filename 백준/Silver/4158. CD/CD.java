import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            int[] nList = new int[n];
            for (int i = 0; i < n; i++) {
                nList[i] = Integer.parseInt(br.readLine());
            }

            int answer = 0;

            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(br.readLine());

                if (binarySearch(nList, num)) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }

    public static boolean binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] < num) {
                left = mid + 1;
            }
            else if (arr[mid] > num) {
                right = mid - 1;
            }
            else {
                return true;
            }
        }

        return false;
    }
}