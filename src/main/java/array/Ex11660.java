package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArr = new int[n + 1][n + 1];

        // 값 구하기 합[2][2] = 합[1][2] + 합[2][1] + 현[2][2] - 합[1][1]
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] + arr[i][j] - sumArr[i - 1][j - 1];
            }
        }

        // 뒷부분인 목표 지점 좌표 의 값을 구하면 전체 그 구간까지의 합
        // x1,y1 -> x2,y2
        // 합[x2][y2] - 합[x1-1][y2] - 합[x2][y1 - 1] + 합[x1][y1] (중복이라서 한번 다시 더해줌)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < question; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
