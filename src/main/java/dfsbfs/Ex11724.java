package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex11724 {

    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //정점 갯수
        int m = Integer.parseInt(st.nextToken()); //간선 갯수

        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];

        // 인접리스트 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 인접리스트 구성
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }

        System.out.println(count);
    }

    private static void dfs(final int v) {
        if (visited[v]) { //이미 방문처리가 됐으면 끝
            return;
        }

        visited[v] = true; //방문처리

        for (Integer i : graph[v]) { // 인접 리스트 계속해서 탐색
            if (!visited[i]) { // 방문하지 않은 노드면 계속 탐색
                dfs(i);
            }
        }
    }

}
