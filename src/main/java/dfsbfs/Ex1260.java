package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1260 {

    private static boolean[] visited;
    private static List<Integer>[] node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드개수
        int n = Integer.parseInt(st.nextToken());

        //에지 개수
        int m = Integer.parseInt(st.nextToken());
        // 시작노드
        int v = Integer.parseInt(st.nextToken());

        node = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int front = Integer.parseInt(st.nextToken());
            int back = Integer.parseInt(st.nextToken());
            node[front].add(back);
            node[back].add(front);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(node[i]);
        }

        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);

    }

    private static void dfs(final int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (Integer value : node[v]) {
            if (!visited[value]) {
                dfs(value);
            }
        }
    }
    private static void bfs(final int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            final Integer poll = q.poll();
            System.out.print(poll + " ");

            for (Integer value : node[poll]) {
                if (!visited[value]) {
                    visited[value] = true;
                    q.offer(value);
                }
            }

        }
    }

}
