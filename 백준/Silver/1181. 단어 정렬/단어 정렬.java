import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        list.sort((word1, word2) -> {
            if (word1.length() != word2.length()) {
                return word1.length() - word2.length();
            }

            return word1.compareTo(word2);
        });
        
        for (String word : list) {
            System.out.println(word);
        }
    }
}