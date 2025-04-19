import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rent = new ArrayList<>();
        
        for (int i : lost) {
            list.add(i);
        }
        
        for (int r : reserve) {
            if (list.contains(r)) {
                list.remove(Integer.valueOf(r));
            }
            else {
                rent.add(r);
            }
        }
        
        Collections.sort(list);
        Collections.sort(rent);
        
        for (int stud : new ArrayList<>(list)) {
            if (stud > 1 && rent.contains(stud - 1)) {
                rent.remove(Integer.valueOf(stud - 1));
                list.remove(Integer.valueOf(stud));
                continue;
            }
            if (stud < n && rent.contains(stud + 1)) {
                rent.remove(Integer.valueOf(stud + 1));
                list.remove(Integer.valueOf(stud));
            }
        }
        
        answer = n - list.size();
        
        return answer;
    }
}