package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4963 {

    private static int[][] arr;
    private static int[] dx = new int[]{1, 0, -1, 0, 1, 1, -1, -1};
    private static int[] dy = new int[]{0, 1, 0, -1, 1, -1, 1, -1};
    private static boolean[][] visited;
    private static int width, height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            //너비와 높이
            StringTokenizer st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());

            // 0, 0 이면 종료
            if (width == 0 && height == 0) {
                return;
            }

            arr = new int[height][width];
            visited = new boolean[height][width];

            for (int i = 0; i < height; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < width; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

    private static void dfs(final int x, final int y) {
        visited[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int newX = dx[i] + x;
            int newY = dy[i] + y;

            if (0 <= newX && newX < height && 0 <= newY && newY < width) {
                if (arr[newX][newY] == 1 && !visited[newX][newY]) {
                    dfs(newX, newY);
                }
            }
        }

    }

}
