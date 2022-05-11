package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex16507 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 행, 열, 평균 구할 횟수
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[][] arr = new int[row + 1][column + 1];

        for (int i = 1; i <= row; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= column; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArr = new int[row + 1][column + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] + arr[i][j] - sumArr[i - 1][j - 1];
            }
        }

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            int divideNumber = (x2 - x1 + 1) * (y2 - y1 + 1);
            bw.write(sum / divideNumber + "\n");
        }

        bw.flush();
        bw.close();
    }
}
