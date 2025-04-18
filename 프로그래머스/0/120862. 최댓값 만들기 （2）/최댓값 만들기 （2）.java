import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int n = numbers.length;
        
        if (n == 2) {
            answer = numbers[0] * numbers[1];
        }
        else {
            int a = numbers[0] * numbers[1];
            int b = numbers[n-1] * numbers[n-2];
            
            answer = a > b ? a : b;
        }
        
        return answer;
    }
}