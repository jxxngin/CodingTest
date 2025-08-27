import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String answer = null;

            for (int i = 0; i < n; i++) {
                String cur = sc.next();

                if (answer == null) {
                    answer = cur;
                }
                else {
                    String lowerCur = cur.toLowerCase(Locale.ROOT);
                    String lowerAns = answer.toLowerCase(Locale.ROOT);
    
                    if (lowerCur.compareTo(lowerAns) < 0) {
                        answer = cur;
                    }   
                }
            }

            System.out.println(answer);
        }
    }
}