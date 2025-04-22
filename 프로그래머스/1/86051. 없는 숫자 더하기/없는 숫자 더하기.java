import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        for (int num : numbers) {
            list.remove(Integer.valueOf(num));
        }
        
        for (int num : list) {
            answer += num;
        }
        
        return answer;
    }
}