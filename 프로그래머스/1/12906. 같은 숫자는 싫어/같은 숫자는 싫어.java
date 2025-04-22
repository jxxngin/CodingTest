import java.util.*;

public class Solution {
    public Queue<Integer> solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int prev = -1;
        
        for (int num : arr) {
            if (queue.size() != 0 && prev == num) {
                continue;
            }
            queue.add(num);
            prev = num;
        }
        
        return queue;
    }
}