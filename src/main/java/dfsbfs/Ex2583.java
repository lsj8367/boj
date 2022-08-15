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

public class Ex2583 {

    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visited = new boolean[y][x];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int startY = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());

            for (int inputY = startX; inputY < endX; inputY++) {
                for (int inputX = startY; inputX < endY; inputX++) {
                    visited[inputY][inputX] = true;
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (Integer number : list) {
            sb.append(number).append(" ");
        }

        System.out.println(list.size());
        System.out.println(sb);
    }

    private static void bfs(final int x, final int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 0));
        visited[x][y] = true;

        int count = 0;
        while (!q.isEmpty()) {
            final Point point = q.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (newX >= 0 && newX < visited.length && newY >= 0 && newY < visited[0].length) {
                    if (!visited[newX][newY]) {
                        visited[newX][newY] = true;
                        q.offer(new Point(newX, newY, point.depth + 1));
                    }
                }
            }
        }

        list.add(count);
    }

    private static class Point {

        private int x;
        private int y;
        private int depth;

        public Point(final int x, final int y, final int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}
