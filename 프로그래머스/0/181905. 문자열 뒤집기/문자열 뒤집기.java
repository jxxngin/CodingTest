import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder str = new StringBuilder(my_string);
        String reverse = str.substring(s, e + 1);
        
        StringBuilder rb = new StringBuilder(reverse);
        rb.reverse();
        
        str.delete(s, e+1);
        str.insert(s, rb);
        
        String answer = str.toString();
        
        return answer;
    }
}