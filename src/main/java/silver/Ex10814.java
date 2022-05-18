package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        list.forEach(member -> sb.append(member.age)
            .append(" ")
            .append(member.name)
            .append("\n"));

        System.out.println(sb);
    }

    private static class Member implements Comparable<Member> {
        private int age;
        private String name;

        public Member(final int age, final String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(final Member o) {
            return Integer.compare(this.age, o.age);
        }
    }

}
