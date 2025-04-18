import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> lenCnt = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            lenCnt.put(len, lenCnt.getOrDefault(len, 0) + 1);
        }
        
        for (int cnt : lenCnt.values()) {
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}