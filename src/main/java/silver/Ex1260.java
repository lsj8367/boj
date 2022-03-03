package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import javax.swing.GroupLayout.Alignment;

public class Ex1260 {

    private static boolean[] visited;
    private static List<List<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        list = new ArrayList<>();

        for (int i = 0; i <= m; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            final int front = Integer.parseInt(st.nextToken());
            final int back = Integer.parseInt(st.nextToken());
            list.get(front).add(back);
            list.get(back).add(front);
        }

        for (int i = 1; i <= m; i++) {
            Collections.sort(list.get(i));
        }

        dfs(v);

        visited = new boolean[n + 1];
        System.out.println();

        bfs(v);
    }

    private static void dfs(final int number) {
        visited[number] = true;
        System.out.print(number + " ");

        for (int i = 0; i < list.get(number).size(); i++) {
            int nextNode = list.get(number).get(i);
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }

    }

    private static void bfs(int number) {
        Queue<Integer> q = new LinkedList<>();
        visited[number] = true;
        q.offer(number);

        while (!q.isEmpty()) {
            number = q.poll();
            System.out.print(number + " ");

            for (int i = 0; i < list.get(number).size(); i++) {
                int nextNode = list.get(number).get(i);
                if (!visited[nextNode]) {
                    q.offer(nextNode);
                    visited[nextNode] = true;
                }
            }
        }

    }

}
