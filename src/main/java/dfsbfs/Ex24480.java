package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex24480 {

    private static int[] answers;
    private static int idx = 0;
    private static List<Integer>[] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        answers = new int[n + 1];
        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            //간선은 서로 두개가 이어진거기 때문에 같이 구성해준다.
            graph[u].add(v);
            graph[v].add(u);
        }

        // 존재하는 인접 리스트 그래프는 1부터다.
        for (int i = 1; i <= n; i++) {
            graph[i].sort(Collections.reverseOrder());
        }

        // 첫 시작 부분 방문처리
        visited[r] = true;

        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(answers[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int index) {
        answers[index] = ++idx;
        for (Integer value : graph[index]) {

            // 이미 방문상태라면 넘어감
            if (visited[value]) {
                continue;
            }

            // 방문상태가 아니었다면 방문처리 후 계속 탐색
            visited[value] = true;
            dfs(value);
        }


    }
}

