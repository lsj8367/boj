package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex24479 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] checks;
    static List<List<Integer>> graphs;
    static int count;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //정점 개수
        int m = Integer.parseInt(st.nextToken()); //간선 개수
        int r = Integer.parseInt(st.nextToken()); //시작 정점
        checks = new int[n + 1];

        graphs = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int front = Integer.parseInt(st.nextToken());
            int back = Integer.parseInt(st.nextToken());
            graphs.get(front).add(back);
            graphs.get(back).add(front);
        }

        for (List<Integer> graph : graphs) {
            Collections.sort(graph);
        }

        count = 1;

        dfs(r);


        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < checks.length; i++) {
            sb.append(checks[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int r) {
        checks[r] = count;
        for (int i = 0; i < graphs.get(r).size(); i++) {
            int vertex = graphs.get(r).get(i);

            if (checks[vertex] == 0) {
                count++;
                dfs(vertex);
            }
        }
    }
}
