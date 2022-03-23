package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex7568 {

    private static final class Person {
        private int weight;
        private int height;

        public Person(final String weight, final String height) {
            this.weight = Integer.parseInt(weight);
            this.height = Integer.parseInt(height);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        StringTokenizer st;
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Person(st.nextToken(), st.nextToken()));
        }

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Person person : list) {
                if (list.get(i).weight < person.weight && list.get(i).height < person.height) {
                    count++;
                }
            }
            result[i] = count + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int value : result) {
            sb.append(value).append(" ");
        }

        System.out.println(sb);
    }
}
