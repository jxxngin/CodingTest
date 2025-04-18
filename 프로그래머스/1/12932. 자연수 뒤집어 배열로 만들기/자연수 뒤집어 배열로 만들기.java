import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        while (n > 0) {
            int num = (int)(n % 10);
            result.add(num);
            n /= 10;
        }
        
        int len = result.size();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}