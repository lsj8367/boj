package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex13023 {

    static List<Integer>[] graph;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n];
        visited = new boolean[n];
        arrive = false;

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);

            if (arrive) {
                break;
            }
        }

        if (arrive) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    private static void dfs(final int now, final int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;

        for (Integer value : graph[now]) {
            if (!visited[value]) {
                dfs(value, depth + 1);
            }
        }

        visited[now] = false;
    }

}
