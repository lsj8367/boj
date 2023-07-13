package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex10026 {

    private static char[][] fields;
    private static boolean[][] visited;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        fields = new char[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            final String s = br.readLine();
            for (int j = 0; j < n; j++) {
                fields[i][j] = s.charAt(j);
            }
        }

        int normal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    normal++;
                }
            }
        }
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (fields[i][j] == 'G') {
                    fields[i][j] = 'R';
                }
            }
        }

        int disabled = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    disabled++;
                }
            }
        }

        System.out.println(normal + " " + disabled);
    }

    private static void dfs(final int x, final int y) {
        visited[x][y] = true;

        char temp = fields[x][y];

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (0 <= newX && newX < n && 0 <= newY && newY < n) {
                if (!visited[newX][newY] && fields[newX][newY] == temp) {
                    dfs(newX, newY);
                }
            }
        }

    }



}
