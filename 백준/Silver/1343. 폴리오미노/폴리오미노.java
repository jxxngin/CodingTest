import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        String board = sc.next();
        String[] Xs = board.split("\\.", -1);
        
        for (int i = 0; i < Xs.length; i++) {
            String x = Xs[i];
            int len = x.length();

            if (len % 2 != 0) {
                System.out.println("-1");
                return;
            }

            StringBuilder ab = new StringBuilder();
            int cntA = len / 4;
            int cntB = (len % 4) / 2;

            for (int j = 0; j < cntA; j++) {
                ab.append("AAAA");
            }
            for (int j = 0; j < cntB; j++) {
                ab.append("BB");
            }

            result.append(ab);

            if (i < Xs.length - 1) {
                result.append(".");
            }
        }

        System.out.println(result);
    }
}