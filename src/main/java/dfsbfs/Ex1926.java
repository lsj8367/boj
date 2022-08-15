package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Pair> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 도화지 행렬
        int[][] paper = new int[n][m];

        // 방문 행렬
        boolean[][] visits = new boolean[n][m];

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        // 행렬 세팅
        for (int row = 0; row < n; row++) {
            st = new StringTokenizer(br.readLine());
            for (int column = 0; column < m; column++) {
                paper[row][column] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        int area;

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {

                if (paper[row][column] == 0 || visits[row][column]) {
                    continue;
                }

                count++;
                q.offer(new Pair(row, column));
                visits[row][column] = true;
                area = 0;

                while (!q.isEmpty()) {
                    final Pair poll = q.poll();
                    area++;

                    for (int i = 0; i < 4; i++) {
                        int newX = poll.x + dx[i];
                        int newY = poll.y + dy[i];

                        if (newX < 0 || newX >= n || newY < 0 || newY >= m) {
                            continue;
                        }

                        if (paper[newX][newY] == 1 && !visits[newX][newY]) {
                            q.offer(new Pair(newX, newY));
                            visits[newX][newY] = true;
                        }
                    }
                }

                if (area > max) {
                    max = area;
                }

            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    private static class Pair {
        private final int x;
        private final int y;

        public Pair(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

    }
}
