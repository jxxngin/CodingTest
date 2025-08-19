import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long answer = 0L;

        if (n == 0) {
            answer = 0L;
        }
        else if (n == 1) {
            answer = 1L;
        }
        else {
            long fn2 = 0L;
            long fn1 = 1L;
            long fn = 0L;

            for (int i = 2; i <= n; i++) {
                fn = fn1 + fn2;
                fn2 =fn1;
                fn1 = fn;
            }

            answer = fn;
        }

        System.out.println(answer);
    }
}