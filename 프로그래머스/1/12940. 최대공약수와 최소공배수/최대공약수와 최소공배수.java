import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);
        int lcm = getLCM(n, m, gcd);
        
        int[] answer = {gcd, lcm};
        
        return answer;
    }
    
    public int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
    
    public int getLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}