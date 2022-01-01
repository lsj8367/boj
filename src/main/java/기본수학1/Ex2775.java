package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2775 {

    //첫번째 줄 test케이스의 수 T
    // 다음 첫째줄 층수 k
    // 호수 n
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int testCase = Integer.parseInt(br.readLine());

        final int[][] apart = initApart();

        addRoomValue(apart);

        printTotalPerson(br, testCase, apart);

    }

    private static int[][] initApart() {
        final int[][] apart = new int[15][15];
        // 0번째는 제외하고 1부터 14만 생각
        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }
        return apart;
    }

    private static void addRoomValue(final int[][] apart) {
        for (int i = 1; i < apart.length; i++) {
            for (int j = 2; j < apart.length; j++) {
                apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
            }
        }
    }

    private static void printTotalPerson(final BufferedReader br, final int testCase, final int[][] apart) throws IOException {
        for (int i = 0; i < testCase; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            System.out.println(apart[floor][room]);
        }
    }

}
