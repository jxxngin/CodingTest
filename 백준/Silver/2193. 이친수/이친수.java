import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N <= 2) {
            System.out.println(1);
            return;
        }

        long a2 = 1;
        long a1 = 1;
        long answer = 0;

        for (int i = 3; i <= N; i++) {
            answer = a1 + a2;
            a2 = a1;
            a1 = answer;
        }

        System.out.println(answer);
    }
}