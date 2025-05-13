import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> score = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int choice = choices[i];
            
            if (choice < 4) {
                score.put(first, score.getOrDefault(first, 0) + (4 - choice));
            } else if (choice > 4) {
                score.put(second, score.getOrDefault(second, 0) + (choice - 4));
            }
        }
        
        answer += score.getOrDefault('R', 0) >= score.getOrDefault('T', 0) ? 'R' : 'T';
        answer += score.getOrDefault('C', 0) >= score.getOrDefault('F', 0) ? 'C' : 'F';
        answer += score.getOrDefault('J', 0) >= score.getOrDefault('M', 0) ? 'J' : 'M';
        answer += score.getOrDefault('A', 0) >= score.getOrDefault('N', 0) ? 'A' : 'N';

        return answer;
    }
}