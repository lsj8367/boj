package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1018 {

    private static boolean[][] chessArr;
    private static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        chessArr = new boolean[N][M];

        //input값 세팅
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    chessArr[i][j] = true;
                } else {
                    chessArr[i][j] = false;
                }
            }
        }

        //경우의 수
        int width = N - 7;
        int height = M - 7;


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private static void find(int x, int y) {
        int xLimit = x + 8;
        int yLimit = y + 8;
        int count = 0;

        boolean TF = chessArr[x][y];

        for (int i = x; i < xLimit; i++) {
            for (int j = y; j < yLimit; j++) {

                //걍 앞전에 색하고 다르면 싹다 포함시킴
                if (chessArr[i][j] != TF) {
                    count++;
                }

                //다음거로 바꾸는 행위
                TF = !TF;
            }

            // 다음줄은 윗줄의 자기 위치와 달라야함
            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }

}
