class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1. 대문자를 소문자로 치환
        answer = new_id.toLowerCase();
        
        // 2. 소문자, 숫자, 빼기, 밑줄, 마침표를 제외하고 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3. 마침표 2번 이상 연속시 하나로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // 4. 마침표가 처음이나 끝이면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");
        
        // 5. 빈 문자열이라면, a 대입
        if (answer.isEmpty()) {
            answer = "a";
        }
        
        // 6. 길이가 16자 이상이라면, 15문자 뒤 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }
        
        // 7. 길이가 2 이하일 경우 끝 문자 붙이기
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}