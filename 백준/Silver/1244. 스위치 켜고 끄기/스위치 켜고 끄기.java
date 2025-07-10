import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] switches = new int[n];
        for(int i = 0; i < n; i++) {
            switches[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();

            switch(gender) {
                case 1:
                    male(switches, num);
                    break;
                case 2:
                    female(switches, num);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(switches[i] + " ");
            
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static void toggle(int[] switches, int idx) {
        switches[idx] ^= 1;
    }

    public static void male(int[] switches, int num) {
        for(int i = num - 1; i < switches.length; i += num) {
            toggle(switches, i);
        }
    }

    public static void female(int[] switches, int num) {
        int left = num - 1;
        int right = num - 1;

        while(left - 1 >= 0 && right + 1 < switches.length) {
            if (switches[left - 1] == switches[right + 1]) {
                left--;
                right++;
            }
            else {
                break;
            }
        }

        for(int i = left; i <= right; i++) {
            toggle(switches, i);
        }
    }
}