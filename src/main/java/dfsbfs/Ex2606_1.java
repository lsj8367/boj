package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2606_1 {

    private static boolean[] visited;
    private static List<Integer>[] computers;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //컴퓨터 수
        int n = Integer.parseInt(br.readLine());

        computers = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        int k = Integer.parseInt(br.readLine());

        // 인접리스트 초기화
        for (int i = 1; i <= n; i++) {
            computers[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i <k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            computers[x].add(y);
            computers[y].add(x);
        }

        dfs(1);
        System.out.println(count);
    }

    private static void dfs(final int index) {
        visited[index] = true;

        for (int i = 0; i < computers[index].size(); i++) {
            int nextNode = computers[index].get(i);
            if (!visited[nextNode]) {
                count++;
                dfs(nextNode);
            }
        }

    }

}
