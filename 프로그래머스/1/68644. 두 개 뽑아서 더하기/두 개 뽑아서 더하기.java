import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        int len = numbers.length;
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> list = new ArrayList<>(result);
        Collections.sort(list);
        
        int size = list.size();
        int[] answer = new int [size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}