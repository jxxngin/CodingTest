import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nums.add(i);
            } 
        }
        
        int len = nums.size();
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}