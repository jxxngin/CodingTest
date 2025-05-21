import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int len = schedules.length;
        
        boolean[] people = new boolean[len];
        Arrays.fill(people, true);
        
        for (int i = 0; i < 7; i++) {
            int weekend = (startday + i) % 7;
            if (weekend == 6 || weekend == 0) {
                continue;
            }
            for (int j = 0; j < len; j++) {
                int expected = (schedules[j] / 100) * 60 + (schedules[j] % 100);
                int actual = (timelogs[j][i] / 100) * 60 + (timelogs[j][i] % 100);
                if (actual - expected > 10) {
                    people[j] = false;
                }
            }
        }
        
        for (boolean result : people) {
            if (result) {
                answer++;
            }
        }
        
        return answer;
    }
}