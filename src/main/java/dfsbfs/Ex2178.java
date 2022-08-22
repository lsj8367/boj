package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Pair> q = new LinkedList<>();
        int[][] distance = new int[102][102];

        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance.length; j++) {
                distance[i][j] = -1;
            }
        }

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            final String[] split = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }

        q.offer(new Pair(0, 0));
        distance[0][0] = 0;
        while (!q.isEmpty()) {
            final Pair pair = q.poll();

            for (int i = 0; i < 4; i++) {
                int newX = pair.x + dx[i];
                int newY = pair.y + dy[i];

                if (newX < 0 || newX >= n || newY < 0 || newY >= m) {
                    continue;
                }

                if (arr[newX][newY] != 1 || distance[newX][newY] >= 0) {
                    continue;
                }

                distance[newX][newY] = distance[pair.x][pair.y] + 1;
                q.offer(new Pair(newX, newY));
            }
        }

        //처음에 0,0으로 시작해줬기 때문에 n,m 좌표에서 -1씩 빼주고 +1 (마지막거리 더함)
        System.out.println(distance[n - 1][m - 1] + 1);
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
