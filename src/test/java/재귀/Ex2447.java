package 재귀;

import org.junit.jupiter.api.Test;

class Ex2447 {

    private static char[][] arr;

    @Test
    void test() {
        final int n = 27;
        arr = new char[n][n];
        solution(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private void solution(final int x, final int y, final int n, final boolean isEmpty) {

        if (isEmpty) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        final int size = n / 3;
        int count = 0;

        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                solution(i, j, size, count == 5);
            }
        }
    }

}
