import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null) {
            String[] nums = line.trim().split(" ");

            if (nums.length == 1 && nums[0].equals("0")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            int prev = -1;
            int len = Integer.parseInt(nums[0]);

            for (int i = 1; i <= len; i++) {
                int n = Integer.parseInt(nums[i]);

                if (n != prev) {
                    sb.append(n).append(" ");
                    prev = n;
                }
            }

            sb.append("$");
            System.out.println(sb);
        }
    }
}