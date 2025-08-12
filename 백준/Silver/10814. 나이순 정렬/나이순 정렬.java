import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(age, name);
        }

        Arrays.sort(people, Comparator.comparingInt(p -> p.age));

        StringBuilder sb = new StringBuilder();

        for (Person p : people) {
            sb.append(p.age).append(" ").append(p.name).append('\n');
        }

        System.out.println(sb);
    }

    static class Person {
        final int age;
        final String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}