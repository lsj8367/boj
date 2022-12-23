package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2644 {

    private static boolean[] visited;
    private static List<Integer>[] people;
    private static int res = -1; //찾을 수 없는 경우 -1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        people = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            people[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        int h1 = Integer.parseInt(st.nextToken());
        int h2 = Integer.parseInt(st.nextToken());

        int index = Integer.parseInt(br.readLine());

        for (int i = 0; i < index; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            people[x].add(y);
            people[y].add(x);
        }

        dfs(h1, h2, 0);
        System.out.println(res);
    }

    private static void dfs(final int x, final int y, int count) {
        if (x == y) {
            res = count;
            return;
        }

        visited[x] = true;
        for (int i = 0; i < people[x].size(); i++) {
            int next = people[x].get(i);
            if (!visited[next]) {
                dfs(next, y, count + 1);
            }
        }
    }

}
